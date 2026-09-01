import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String in = scanner.nextLine();
            
            String[] arr = in.split(",");
            
            int[] arr2 = new int[arr.length];
            
            for(int j = 0; j < arr.length; j++){
                arr2[j] = Integer.parseInt(arr[j]);
            }
            
            Arrays.sort(arr2);
            String h = "";
            for(int c = 0; c < arr2.length; c++){
                h += arr2[c];
                h += ",";
            }
            
            System.out.println(h.substring(0, h.length()-1));
            
        }
    }
}