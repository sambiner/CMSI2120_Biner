    /**
    * File name: SourceFile.java
    * Description: Read in the input file
    * Developer: Sam Biner
    * Date: 09/14/2022
    */

   package copiersupport;           // note that this is the name of the directory!

   import java.io.BufferedReader;
   import java.io.FileNotFoundException;
   import java.io.FileReader;
   import java.io.IOException;
   import java.util.Scanner;


   public class SourceFile {

      private String fileInputBuffer = "";

      public SourceFile( String fileName ) {

         BufferedReader br = null;
         try {
            br = new BufferedReader( new FileReader( fileName ) );
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while( line != null ) {
               sb.append( line );
               sb.append( System.lineSeparator() );
               line = br.readLine();
            }
            fileInputBuffer = sb.toString();
            br.close();
         }
         catch( IOException ioe ) {
            System.out.println( "Error reading input file." );
         }
      }

      public String getBuffer() {
         return fileInputBuffer;
      }
   }
