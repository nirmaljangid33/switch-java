
import java.util.Scanner;

public class A3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ch  o or e : ");
        char n = sc.next().charAt(0);
        switch (n) {
            case 'e': {
                System.out.print("Enter the number :");
                int i = sc.nextInt();
                if(i%2==0){
                System.out.println(i+" even number");
                }
                break;
            }
            case 'o': {
                System.out.print("Enter the number :");
                int i = sc.nextInt();
                if(i%2!=0){
                System.out.println(i+" odd number");
                }
                break;
            }
            default: {
                System.out.println("Enter the valid char ");
            }

        }
    }
}