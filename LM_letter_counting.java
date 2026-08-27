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
            System.out.println(y.length() + 1);
        }
    }
}