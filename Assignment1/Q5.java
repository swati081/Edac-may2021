import java.util.Scanner;
 
 class Q5 {
 
 public static void main(String[] args) 
 {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int num2 = in.nextInt();
   
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
 }
 
}