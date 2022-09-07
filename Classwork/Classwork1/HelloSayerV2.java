/*
File Name: HelloSayerV2.java
Description: A simple program that accepts a user input and greets the user by what they put in.
Date: 08/31/2022
Developer: Sam Biner
*/

import java.util.Scanner;
class HelloSayerV2 {
  public static void main(String args[]){
    System.out.println("Please enter your name here: \n");
    Scanner myInput = new Scanner( System.in );
    String inputName = myInput.nextLine();
    System.out.println("\nHello there, " + inputName);
  }
}
