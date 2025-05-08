import java.util.Scanner;
public class qs9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        for(int i= sb.length()-1;i>=0;i--){
            char ch = Character.toLowerCase(sb.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.deleteCharAt(i);
            }
        }
        System.out.println("String after deleting vowels: " + sb.toString());
    }
}
