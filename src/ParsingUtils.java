import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.AstNode;

public class ParsingUtils {
    static public AstNode createAst(String program)
    {
        ParseTree tree = createParseTree(program);
        CoDScriptVisitor<AstNode> visitor = new AstCreationVisitor();
        return tree.accept(visitor);
    }

    public static ParseTree createParseTree(String program)
    {
        ANTLRInputStream antlrInput = new ANTLRInputStream(program);
        CoDScriptLexer lexer = new CoDScriptLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CoDScriptParser parser = new CoDScriptParser(tokens);
        return parser.program();
    }
}
