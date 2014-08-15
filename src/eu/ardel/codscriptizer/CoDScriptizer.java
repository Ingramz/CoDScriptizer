package eu.ardel.codscriptizer;

import org.apache.commons.cli.*;

import java.io.File;

public class CoDScriptizer {
    public static void main(String[] args) {
        printHeader();

        Options options = new Options();
        options.addOption(OptionBuilder.withArgName("file").hasArg().withDescription("Lint a source file").withLongOpt("lint").create("l"));
        options.addOption(OptionBuilder.withArgName("path").hasArg().withDescription("Minify source file or directory").withLongOpt("minify").create("y"));
        options.addOption(OptionBuilder.withArgName("directory").hasArg().withDescription("Minifies and combines together all optional files in a directory").withLongOpt("minimize").create("z"));

        CommandLine cl = null;
        try {
            cl = new BasicParser().parse(options, args);
        } catch (ParseException e) {
            System.err.println("Parsing program arguments failed.  Reason: " + e.getMessage());
            System.exit(1);
        }

        if(cl.hasOption("l")) {
            File f = getFileFromArgument(cl.getOptionValue("l"));
            new CoDScriptLinter(f);
        } else if(cl.hasOption("y")) {
            File f = getFileFromArgument(cl.getOptionValue("y"));
            new CoDScriptMinifier(f);
            System.out.println("This feature has not been implemented yet.");
        } else if(cl.hasOption("z")) {
            File f = getFileFromArgument(cl.getOptionValue("z"));
            if(f.isDirectory()) {
                new CoDScriptMinimizer(f);
                System.out.println("This feature has not been implemented yet.");
            } else {
                System.err.println("Argument has to be a directory");
                System.exit(1);
            }
        } else {
            new HelpFormatter().printHelp("CoDScriptizer", options);
        }
    }

    static File getFileFromArgument(String argument) {
        if(argument == null) {
            System.err.println("No file or directory specified");
        } else {
            File f = new File(argument);
            if(f.exists()) {
                return f;
            } else {
                System.err.printf("File or directory '%s' does not exist\n", f.getAbsolutePath());
            }
        }
        System.exit(1);
        return null;
    }

    static void printHeader() {
        System.out.println("CoDScriptizer 0.3");
        System.out.println("(c) 2014 Indrek 'Ingram' Ardel");
        System.out.println("Submit questions and issues to http://github.com/Ingramz/CoDScriptizer/issues");
        System.out.println();
    }
}