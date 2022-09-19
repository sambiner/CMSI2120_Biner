        /**
        * Filename: MyFileCopier.java
        * Description: uses two package classes to edit files
        * Date: 09/14/2022
        * Developer: Sam Biner
        */

        import copiersupport.SourceFile;
        import copiersupport.TargetFile;
        import java.util.Scanner;


        public class MyFileCopier {

          private static String sourceFileName;
          private static String targetFileName;

         // This is where the constructor goes
         //  you will need to ask the user for the file name to copy
         //  that should go into a variable declared above
         //  you should then use that variable to create the output variable value
         //     as described in the specification above
          public MyFileCopier() {

            // TODO:  You must fill in this part of the constructor
            System.out.println("\n\n    Welcome to a file copier program: a program that copies files!\n\n");
            Scanner myInput = new Scanner(System.in);
            System.out.println("    Please input a file name you wish to copy: ");
            sourceFileName = myInput.nextLine();
            targetFileName = sourceFileName + ".copy";

             System.out.println( "\n   Copying " + sourceFileName + " to " + targetFileName );
          }

         // This is the main method for the entire 'MyFileCopier' program
          public static void main( String[] args ) {

             MyFileCopier mfc = new MyFileCopier();                // call the constructor
             SourceFile sf = new SourceFile(sourceFileName);     // open the source file
             String fileContents = sf.getBuffer();                 // read in the contents
             System.out.println( "contents: " + fileContents );    // display them

            // call the target file constructor passing the name and the contents
            //  of the source file you just read AS ARGUMENTS
             TargetFile tf = new TargetFile(targetFileName, fileContents);
             System.exit(0);

          }
       }
