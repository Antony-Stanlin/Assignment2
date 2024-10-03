//4. Write a program to find second occurrence of a given number in an array

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements one by one:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter number which you want to search: ");
        int target=sc.nextInt();
        System.out.println(new Question4().secondOccur(a,target));
        sc.close();
    }
    int secondOccur(int[] a,int target){
        int count=0,i;
        for(i=0;i<a.length;i++){
            if(a[i]==target)
                count++;
            if(count>1)
                return i+1;
        }
        return -1;
    }
}
