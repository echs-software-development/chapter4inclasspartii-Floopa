import java.util.Scanner;

class Prob2 {
  public static void main(String[] args) {
    //Declare a scanner and input a String
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string:");
    String h = scan.nextLine();

    //Print first charcter
    System.out.println(h.substring(0,1));

    //Print last charcter 
    System.out.println(h.substring(h.length()-1));


    
  }
}