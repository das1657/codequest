import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String y = scanner.nextLine();
            String reverse = "";
            for (int b = 0; b < y.length(); b++) {
                reverse = y.charAt(b) + reverse;
            }
            
            System.out.println(reverse);
            
        }
    }
}