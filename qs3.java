import java.util.Scanner;
public class qs3{
    public static int divisorSum(int a){
        int sum=0;
        for(int i=1;i*i<=a;i++){
            if(a%i==0) sum+=i;
            if(i!=a/i) sum+=a/i;
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int sum1 = divisorSum(num1);
        int sum2 = divisorSum(num2);
        if(sum1/num1==sum2/num2) System.out.println("Friendly Pair");
        else System.out.println("Not Friendly Pair");
        sc.close();
    }
}