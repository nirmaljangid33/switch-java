import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter v :check voter id valid or not : ");
        char n = sc.next().charAt(0);
        switch (n) {
            case 'v': {
                System.out.print("Enter the age :");
                int i = sc.nextInt();
                if(i >=18){
                System.out.println("A person is eligible for vote");
            }
            else {
                    System.out.println("A person is not eligible for vote");
                }
                break;
            }
            default: {
                System.out.println("Enter the valid char ");
            }

        }
    }
}
