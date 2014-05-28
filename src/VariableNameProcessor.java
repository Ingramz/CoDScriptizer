import ast.*;

import java.util.*;

public class VariableNameProcessor
{
    static void processProgram(Program an)
    {
        List<Object> nodes = an.getChildren();
        for(int i=0;i<nodes.size();i++)
        {
            if(nodes.get(i) instanceof FunctionDefinition)
            {
                Map<String, RecordedVariable> vars = new HashMap<String, RecordedVariable>();
                proc(nodes.get(i), vars, new Counter());
                ValueComparator bvc =  new ValueComparator(vars);
                TreeMap<String,RecordedVariable> sorted_map = new TreeMap<String,RecordedVariable>(bvc);
                sorted_map.putAll(vars);
                //printMap(sorted_map);

                Map<String, String> replaceMap = new HashMap<String, String>();

                VariableNameGenerator vgn = new VariableNameGenerator();

                for(Map.Entry<String,RecordedVariable> entry : sorted_map.entrySet()) {
                    String key = entry.getKey();
                    RecordedVariable value = entry.getValue();
                    replaceMap.put(key, vgn.getNext(value.first, value.last));
                }
                proc2(nodes.get(i), replaceMap);
            }
        }
    }

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }

    static void proc(Object an, Map<String, RecordedVariable> lrv, Counter usageCounter)
    {
        if(an instanceof Variable)
        {
            Variable v = (Variable)an;
            if(v.getName().toLowerCase().equals("game") ||
                    v.getName().toLowerCase().equals("level") ||
                    v.getName().toLowerCase().equals("self"))
            {

            } else {
                RecordedVariable rv = lrv.get(v.getName().toLowerCase());
                if(rv == null)
                {
                    lrv.put(v.getName().toLowerCase(), new RecordedVariable(usageCounter.next()));
                } else
                {

                    rv.updateLast(usageCounter.next());
                }
            }
        }
        else if(an instanceof ForLoop)
        {
            ForLoop l = (ForLoop) an;
            proc(l.precond, lrv, usageCounter);
            proc(l.cond, lrv, usageCounter);
            proc(l.code, lrv, usageCounter);
            proc(l.postcond, lrv, usageCounter);
            proc(l.cond, lrv, usageCounter);
        }
        else if(an instanceof WhileStatement)
        {
            WhileStatement l = (WhileStatement) an;
            proc(l.getCondition(), lrv, usageCounter);
            proc(l.getBody(), lrv, usageCounter);
            proc(l.getCondition(), lrv, usageCounter);
        }
        else if(an instanceof AstNode)
        {
            List<Object> children = ((AstNode)an).getChildren();
            for(int i=0;i<children.size();i++)
            {
                proc(children.get(i), lrv, usageCounter);
            }
        } else if(an instanceof Collection)
        {
            for(Object o : (Collection)an)
            {
                proc(o, lrv, usageCounter);
            }
        }
    }

    static void proc2(Object an, Map<String, String> repl)
    {
        if(an instanceof Variable)
        {
            Variable v = (Variable)an;
            if(v.getName().toLowerCase().equals("game") ||
                    v.getName().toLowerCase().equals("level") ||
                    v.getName().toLowerCase().equals("self"))
            {

            } else {
                v.setName(repl.get(v.getName().toLowerCase()));
            }
        }
        else if(an instanceof AstNode)
        {
            List<Object> children = ((AstNode)an).getChildren();
            for(int i=0;i<children.size();i++)
            {
                proc2(children.get(i), repl);
            }
        } else if(an instanceof Collection)
        {
            for(Object o : (Collection)an)
            {
                proc2(o, repl);
            }
        }
    }
}

class RecordedVariable implements Comparable<RecordedVariable>
{
    int first = -1;
    int last = -1;

    List<Integer> occurences = new ArrayList<Integer>();

    RecordedVariable(int first) {
        this.first = first;
        updateLast(first);
    }

    public void updateLast(int l)
    {
        last = l;
        occurences.add(l);
    }

    @Override
    public String toString() {
        return "First: "+first+", last: "+last;
    }

    @Override
    public int compareTo(RecordedVariable o)
    {
        if(o.first == this.first && o.last == this.last)
            return 0;

        if(first < o.first || (first == o.first && last < o.last))
            return -1;

        return 1;
    }
}

class Counter
{
    private int val = 0;

    int next()
    {
        return val++;
    }
}

class ValueComparator implements Comparator<String> {

    Map<String, RecordedVariable> base;
    public ValueComparator(Map<String, RecordedVariable> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.
    public int compare(String a, String b) {
        if (base.get(a).compareTo(base.get(b)) < 0) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}

class VariableNameGenerator
{
    TreeMap<Integer, Integer> vals = new TreeMap<Integer, Integer>();
    final String alpha = "abcdefghijklnmopqrstuvwxyz_";

    String getNthColumnName(int n)
    {
        String name = "";
        while (n > 0) {
            n--;
            name = alpha.charAt(n%alpha.length()) + name;
            n /= alpha.length();
        }
        return name;
    }

    String getNext(Integer pos, Integer expect)
    {
        Integer last = null;
        for(Map.Entry<Integer, Integer> entry : vals.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if(pos > value)
            {
                vals.put(key, expect);
                return getNthColumnName(key);
            }
            last = key;
        }
        if(last == null)
        {
            last = 1;
        } else {
            last++;
        }

        vals.put(last, expect);
        return getNthColumnName(last);
    }
}