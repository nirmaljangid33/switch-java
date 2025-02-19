import java.util.Scanner;

public class A4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Operator: ");
        char n = sc.next().charAt(0);
        switch (n) {
            case '+': {
                System.out.print("Enter the a :");
                int b = sc.nextInt();
                System.out.print("Enter the b :");
                int a = sc.nextInt();
                System.out.println(" sum is = " + (a+b));
                break;
                }
            
                case '-': {
                    System.out.print("Enter the a :");
                    int b = sc.nextInt();
                    System.out.print("Enter the b :");
                    int a = sc.nextInt();
                    System.out.println("sub is = " + (a-b));
                    break;
                    }
            case '*': {
                System.out.print("Enter the a :");
                int a = sc.nextInt();
                System.out.print("Enter the b :");
                int b = sc.nextInt();
                System.out.println("mul is = " + (a*b));
                break;
                }
            case '/': {
                System.out.print("Enter the a :");
                int a = sc.nextInt();
                System.out.print("Enter the b :");
                int b = sc.nextInt();
                System.out.println("diva is = " + (a/b));
                break;
                }
            case '%': {
                 System.out.print("Enter the a :");
                 int a = sc.nextInt();
                 System.out.print("Enter the b :");
                 int b = sc.nextInt();
                 System.out.println("modu is = " + (a%b));
                 break;
                 }
                        
            default: {
                System.out.println("Enter the valid Operator : ");
            }

        }
    }
}
