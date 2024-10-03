//Write a program to print prime numbers between 1 to 30

public class Question5 {
    public static void main(String[] args) {
        System.out.println("The prime numbers are: ");
        new Question5().printPrime(1,30);
    }
    void printPrime(int start,int end){
        for(int i=start;i<=end;i++){
            if(i<2)
                continue;
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
    boolean isPrime(int n){
        for(int i=2;i<n/2+1;i++)
            if(n%i==0)
                return false;
        return true;
    }
}
