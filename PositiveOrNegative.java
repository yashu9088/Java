import java.util.Scanner;
class PositiveOrNegative{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Entered number is " + ((num>0)?"positive":(num==0?"zero":"negative")));
    }
}


// To Check Array 
// public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a array size");
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         for(int i=0;i<n;i++){
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Entered numbers are ");
//         for(int i=0;i<n;i++){
//             System.out.println(a[i] + " is " +((a[i]>0)?"positive":(a[i]==0?"zero":"negative")));
//         }
//     }
