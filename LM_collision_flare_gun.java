import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String input = scanner.nextLine();
            
            String[] arr = input.split(",");
            
            double v1 = Double.parseDouble(arr[0]);
            double m1 = Double.parseDouble(arr[1]);
            double v2 = Double.parseDouble(arr[2]);
            double m2 = Double.parseDouble(arr[3]);
            
            double V = (((m1*v1)+(m2*v2))/(m1+m2));
            
            System.out.println(String.format("%.2f", V));
            
            
            
            
            
        }
        
    }
}