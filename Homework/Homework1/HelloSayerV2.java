import java.util.Scanner;
class HelloSayerV2 {
  public static void main(String args[]){
    System.out.println("Please enter your name here: \n");
    Scanner myInput = new Scanner( System.in );
    String inputName = myInput.nextLine();
    System.out.println("\nHello there, " + inputName);
    System.out.println("\nHello, World! \n");
  }
}
