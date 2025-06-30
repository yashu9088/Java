import java.util.Scanner;
class PositiveOrNegative{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Entered number is " + ((num>0)?"positive":(num==0?"zero":"negative")));
    }
}