import java.util.Scanner;

public class qs8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int cnt = 0;
        int n = s.length();

       
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(j) == '0') {
                        if(s.substring(i+1,j).contains("1")){
                            cnt++;
                            break;
                        }
                        }
                        
                    }
                }
            }
        
        System.out.println("Total Patterns: " + cnt);
        sc.close();
    }
}
