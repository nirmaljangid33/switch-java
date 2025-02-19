

 import java.util.Scanner;

 public class A7 {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("a=armstrong number\np =prime number\ne =even\no =odd\nf =factorial\nr =reverse\nl =fibonacci\nt =perfect number\nn =neon number\nw =leap year\ns =swap one way\nv =vowel and consonantEnter a character:-");
         char ch = sc.next().charAt(0);
         switch (ch) {
             case 'a':
                 System.out.println("Enter number to check Armstrong");
                 int num = sc.nextInt();
                 int temp=num;
                 int sum=0;
                 while(num>0){
                     int rem=num%10;
                     sum=sum+(rem*rem*rem);
                     num=num/10;
                 }
                 if(temp==sum){
                     System.out.println("Number is Armstrong");
                 }
                 else{
                     System.out.println("Number is not Armstrong"); 
                     }
                 break;
             case 'p':
                 System.out.println("Enter to check prime");
                 num=sc.nextInt();
                 int count=0;
                 for(int i=1;i<=num;i++){
                     if(num%i==0){
                         count++;
                     }
                 }
                 if(count==2){
                     System.out.println("Number is prime");
                 }
                 else{
                     System.out.println("Number is not prime");
                 }
                 break;
             case 'e':
                 System.out.println("Enter number to check even");
                 num=sc.nextInt();
                 if(num%2==0){
                     System.out.println("Number is even");
                     }
                 else{
                     System.out.println("Number is not even");
                 }
                 break;
             case 'o':
                 System.out.println("Enter number to check odd");
                 num=sc.nextInt();
                 if(num%2!=0){
                     System.out.println("Number is odd");
                 }
                 else{
                     System.out.println("Number is not odd");
                 }
                 break;
             case 'f':
                 System.out.println("Enter number to check factorial");
                 num=sc.nextInt();
                 int fact=1;
                 for(int i=1;i<=num;i++){
                     fact=fact*i;
                 }
                 System.out.println("Factorial of number is "+fact);
                 break;
             case 'r':
                 System.out.println("Enter number to check reverse");
                 num=sc.nextInt();
                 sum=0;
                 while(num!=0){
                     int rem=num%10;
                     sum=sum*10+rem;
                     num/=10;
                 }
                 System.out.println("Reverse of number is "+sum);
                 break;
             case 'l':
                 System.out.println("Enter number to write fibonacci series");
                 int n=sc.nextInt();
                 int a=0,b=1;
                 System.out.println("Fibonacci series is");
                 for(int i=0;i<n;i++){
                     System.out.println(a);
                     int c=a;
                     a=b;
                     b=c+b;
                 }
                 break;
             case 't':
                 System.out.println("Enter number to check Perfect number:-");
                 num=sc.nextInt();
                 sum=0;
                 for(int i=1;i<num;i++){
                     if(num%i==0){
                         sum=sum+i;
                     }
                 }
                 if(sum==num){
                     System.out.println("Number is perfect");
                 }
                 else{
                     System.out.println("Number is not perfect");
                 }
                 break;
             case 'n':
                 System.out.println("Enter to check neon number:-");
                 num=sc.nextInt();
                 sum=0;
                 temp=num*num;
                 sum=0;
                 while(temp>0){
                 int rem=temp%10;
                 sum=sum+rem;
                 temp=temp/10;
                 }
                 if(sum==num){
                     System.out.println("Number is neon");
                 }
                 else{
                     System.out.println("Number is not neon");
                 }
                 break;
             case 'w':
                 System.out.println("Enter year to check Leap year:-");
                 num=sc.nextInt();
                 if(num%4==0 && num%100!=0 || num%400==0){
                     System.out.println("Year is leap year");
                 }
                 else{
                     System.out.println("Year is not leap year");
                 }
                 break;
             case 's':
                 System.out.println("Enter number 1 for swap:-");
                 num=sc.nextInt();
                 System.out.println("Enter number 2 for swap:-");
                 int num1=sc.nextInt();
                 System.out.println();
                 System.out.println("Before swapping:-");
                 System.out.println("Number 1:-"+num);
                 System.out.println("Number 2:-"+num1);
                 temp=num;
                 num=num1;
                 num1=temp;
                 System.out.println("After swapping:-");
                 System.out.println("Number 1:-"+num);
                 System.out.println("Number 2:-"+num1);
                 break;
             case 'v':
                 System.out.println("Enter char to vowel or consonant:-");
                 char c=sc.next().charAt(0);
                 if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                     System.out.println("Char is vowel");
                 }
                 else{
                     System.out.println("Char is consonant");
                     }
                     break;
             default:
                 System.out.println("Invalid choice");
         }
     }
 }