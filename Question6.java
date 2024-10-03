//6. Write a program to find the sum of even numbers only in a given array. Use continue.

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt(),sum=0;
        int a[]=new int[n];
        System.out.println("Enter the element one by one:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==1)
                continue;
            sum+=a[i];
        }
        System.out.println("The sum of Even numbers is: "+sum);
    }
}
