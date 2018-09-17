 import java.util.Scanner;

public class Telephone
{
 public static void main(String[] args){

       Scanner scan = new Scanner(System.in);//get user input

       System.out.print( "Please enter a phone number:");
       String word = scan.nextLine();
       String areacode = word.substring(0,3);
       String code2 = word.substring(3,6);
       String code3 = word.substring(6,10);

       System.out.println("(" + areacode + ") " + code2 + "-" + code3);



 }
}
