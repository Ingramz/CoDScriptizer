import ast.AstNode;
import ast.Program;
import ast.Variable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class ASTTest
{
    public static void main(String[] args) throws Exception
    {
        String program = new String(Files.readAllBytes(Paths.get("test.gsc")), StandardCharsets.UTF_8);
        AstNode an = ParsingUtils.createAst(program);
        ParseTree pt = ParsingUtils.createParseTree(program);
        System.out.println(pt);
        System.out.println(an);
        VariableNameProcessor.processProgram((Program)an);
        System.out.println(an);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(SourceCodeBuilder.rebuild((Program)an));
    }
}
