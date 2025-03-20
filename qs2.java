import java.util.Scanner;
public class qs2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Term Deposit and 2 for Recurring Deposit");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Principle");
                double p = sc.nextDouble();
                 System.out.println("Enter Rate");
                 double r = sc.nextDouble();
                  System.out.println("Enter time");
                   int t = sc.nextInt();
                   double a = p*(1+r/100)*t;
                   System.out.println("Amount = "+a);
                    break;
            case 2:
                System.out.println("Enter Principle");
                   p = sc.nextDouble();
                 System.out.println("Enter Rate");
                    r = sc.nextDouble();
                  System.out.println("Enter time");
                    t = sc.nextInt();
                    a = p*t+p*t*(t+1)/2*r/100*1/12;
                   System.out.println("Amount = "+a);
                    break;
             default:
                System.out.println("Enter valid choice");       

        }
        sc.close();
    }
}