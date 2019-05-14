import java.util.Scanner;

public class SumInt {
    public static void main(String[] args) {

        int total=0;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        while (number != 0) {
            System.out.println("Enter integers :");
            int n1=sc.nextInt();
            total += n1;
            number--;
        } // <-- end loop body.

        System.out.println("The total is " + total);


    }
}
