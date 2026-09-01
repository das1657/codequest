import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String g = scanner.nextLine();
            
            String[] arr = g.split(" ");
            
            int times = Integer.parseInt(arr[0]);
            int herald = Integer.parseInt(arr[1]); 
            
            String output = "";
            
            if (times > herald){
                output += "Times has ";
            }
            
            if (times < herald){
                output += "Herald has ";
            }
            
            if (times == herald){
                output += "Times and Herald have the same number of subscribers";
            }
            
            if (times > herald){
                output += (times - herald);
                output += " more subscribers";
            }
            
            if (times < herald){
                output += (herald - times);
                output += " more subscribers";
            }
            
            System.out.println(output);
            
            
        }
    }
}