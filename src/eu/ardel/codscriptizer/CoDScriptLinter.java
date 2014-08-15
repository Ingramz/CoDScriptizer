package eu.ardel.codscriptizer;

import eu.ardel.codscriptizer.ast.AstNode;
import eu.ardel.codscriptizer.astgen.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CoDScriptLinter {
    public CoDScriptLinter(File f) {
        AstNode an = null;
        String program = null;
        try {
            program = new String(Files.readAllBytes(Paths.get(f.getAbsolutePath())), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Unable to read file.");
            System.exit(1);
        }

        try {
            an = Utils.createAst(program);
        } catch (RuntimeException e) {
            System.out.println("Linter exited successfully with parsing errors.");
            System.exit(0);
        }

        if(an != null)
        {
            System.out.println("Linter found no parsing errors.");
        }
    }

    public static void linter_message(boolean is_error, int lineStart, int colStart, int lineEnd, int colEnd, String module, String message) {
        // Linter messages have to start with "linter "
        System.out.println("linter " + (is_error?"error":"warning") + " from line " + lineStart + ":" + colStart +
                           " to " + lineEnd + ":" + colEnd + " " + module + ": " + message);
    }
}
