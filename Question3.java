//3. Write a program to print multiplication table of a given number in a neat format

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int n=sc.nextInt();
        System.out.print("Enter the total no of multiplication you want: ");
        int limit=sc.nextInt();
        new Question3().printTable(n,limit);
        sc.close();
    }

    void printTable(int n,int size){
        for(int i=1;i<=size;i++)
            System.out.println(i+" x "+n+" = "+(i*n));
    }
}
