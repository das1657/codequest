import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0 ; i < x; i++){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            String y = scanner.nextLine();
            
            String[] splitted = y.split(" ");
            
            for(int b = 0; b < splitted.length; b++){
                arr.add(Integer.parseInt(splitted[b]));
            }
            
        System.out.println(Collections.max(arr));

            
        }
        
    }
}