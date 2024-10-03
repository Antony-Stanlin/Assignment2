//2. Create a program that takes a student's score as input and outputs their corresponding grade

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Mark: ");
        double mark=sc.nextDouble();
        while(mark<=0 || mark>100)
        {
            System.out.print("Enter valid Mark: ");
            mark=sc.nextDouble();
        }
        System.out.println(new Question2().getGrade(mark));
        sc.close();
        
    }
    char getGrade(double n){
        if(n>90)
            return 'A';
        if(n>80)
            return 'B';
        if(n>70)
            return 'C';
        if(n>60)
            return 'D';
        if(n>50)
            return 'E';
        else
            return 'F';
    }
}
