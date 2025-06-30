import java.util.Scanner;

class NaturalNoSum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number1");
        int num1 = sc.nextInt();
        System.out.println("Enter no number2");
        int num2 = sc.nextInt();
        System.out.println("Sum of number from " + num1 + " to "+ num2 + " is "+ (  num2*(num2+1)/2  - num1*(num1+1)/2 + num1   ) )    ;
    }
}



//System.out.println("Sum of First N natural no is " +  (n*(n+1))/2);