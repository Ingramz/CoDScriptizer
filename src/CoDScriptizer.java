import ast.AstNode;
import ast.Program;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class CoDScriptizer
{
    public static void main(String[] args)
    {
        if (args.length == 1) {
            PrintWriter pw = null;
            try {
                String program = new String(Files.readAllBytes(Paths.get(args[0])), StandardCharsets.UTF_8);
                AstNode an = ParsingUtils.createAst(program);
                VariableNameProcessor.processProgram((Program)an);
                String min = SourceCodeBuilder.rebuild((Program)an);
                pw = new PrintWriter(new File(args[0]));
                pw.write(min);
                pw.close();
            } catch (IOException e) {
                System.err.println("Faili ei saanud lugeda.");
            } finally {
                if(pw != null)
                    pw.close();
            }
        } else
            System.err.println("Kasuta nii: codscriptizer failinimi");
    }
}
