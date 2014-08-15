package eu.ardel.codscriptizer.astgen;

import eu.ardel.codscriptizer.CoDScriptLinter;
import eu.ardel.codscriptizer.ast.AstNode;
import eu.ardel.codscriptizer.astgen.generated.CoDScriptLexer;
import eu.ardel.codscriptizer.astgen.generated.CoDScriptParser;
import eu.ardel.codscriptizer.astgen.generated.CoDScriptVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Utils {
    static String stripOutermostQuotes(String str)
    {
        if(str.length() >= 2 && str.startsWith("\"") && str.endsWith("\""))
            str = str.substring(1, str.length()-2);
        return str;
    }

    static Object objectCloner(Object o)
    {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(o);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (IOException e) {
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    static public AstNode createAst(String program)
    {
        ParseTree tree = parseWithExceptions(program);
        CoDScriptVisitor<AstNode> visitor = new AstGeneratorVisitor();
        return tree.accept(visitor);
    }

    private static ParseTree parseWithExceptions(String program) {
        ANTLRInputStream input = new ANTLRInputStream(program);
        CoDScriptLexer lexer = new CoDScriptLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener(){
            @Override
            public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object offendingSymbol, int line, int charPositionInLine, @NotNull String msg, @Nullable RecognitionException e) {
                parserToLinter(false, offendingSymbol, line, charPositionInLine, msg);
            }
        });

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CoDScriptParser parser = new CoDScriptParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener(){
            @Override
            public void syntaxError(@NotNull Recognizer<?, ?> recognizer, @Nullable Object offendingSymbol, int line, int charPositionInLine, @NotNull String msg, @Nullable RecognitionException e) {
                parserToLinter(true, offendingSymbol, line, charPositionInLine, msg);
            }
        });

        ParseTree parseTree = parser.program();
        if (parseTree == null || parseTree.getChildCount() == 0 || parser.getNumberOfSyntaxErrors() != 0) {
            throw new RuntimeException("Problem with parsing");
        }
        return parseTree;
    }

    private static void parserToLinter(boolean is_parser, Object offendingSymbol, int line, int charPositionInLine, String msg)
    {
        int len = 0;
        if(offendingSymbol instanceof CommonToken)
        {
            CommonToken os = (CommonToken)offendingSymbol;
            String txt = os.getText();
            if(txt != null)
                len = txt.length();
        }

        CoDScriptLinter.linter_message(true, line, charPositionInLine + 1, line, charPositionInLine + 1 + len, is_parser?"Parser":"Lexer", msg);
    }
}
