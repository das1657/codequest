import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            int projects = scanner.nextInt();
        scanner.nextLine();

            int hours = 0;
            
            for(int h = 0; h < projects; h++){
                String input = scanner.nextLine();
                
                String[] arr = input.split(" ");
                
                for(int j = 0; j < arr.length; j++){
                    hours += Integer.parseInt(arr[j]);
                }
                
            }
            
            System.out.println(hours - 40);
            
        }
        
    }
}