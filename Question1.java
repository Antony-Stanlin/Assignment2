//1. Take three numbers from the user and print the greatest number.

import java.util.Scanner;

public class Question1 {

   public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int a=sc.nextInt();
      System.out.print("Enter the second number: ");
      int b=sc.nextInt();
      System.out.print("Enter the third number: ");
      int c=sc.nextInt();
      System.out.println(new Question1().max(a,b,c));
      sc.close();
   } 
   int max(int a,int b,int c){
      if(a>b && a>c)
         return a;
      if(b>c)
         return b;
      else
         return c;
   }
}

