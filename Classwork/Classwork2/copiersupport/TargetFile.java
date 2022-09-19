  /**
   * File name: TargetFile.java
   * Description: write out a copy of the input file
   * Developer: Sam Biner
   * Date: 09/14/2022
   */

  package copiersupport;
  import java.io.BufferedWriter;
  import java.io.FileWriter;
  import java.io.IOException;


  public class TargetFile {

     public TargetFile(String fileName, String fileContent) {
        BufferedWriter bw = null;
        try {
           bw = new BufferedWriter(new FileWriter(fileName));
           bw.write( fileContent );
           bw.close();
        }
        catch( IOException ioe ) {
           System.out.println( "Error writing target file." );
        }
     }
  }
