import java.util.*;
class EvenOrOdd {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(" Entered number is " +( (num%2==0)?"even":"odd" ));
    }


}

// modified by rajath