
import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ch  : ");
        char n = sc.next().charAt(0);
        switch (n) {
            case 'm': {
                System.out.println("male");
                break;
            }
            case 'f': {
                System.out.println("female");
                break;
            }
            default: {
                System.out.println("Enter the valid char ");
            }

        }
    }
}