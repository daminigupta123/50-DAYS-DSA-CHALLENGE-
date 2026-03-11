import java.util.Scanner;
public class javapractice {
        public static void main(String[] args) {
        // You can test the methods here
        // for(int i=0;i<=10;i++){
            // System.out.println(i);
        // }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
         System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
