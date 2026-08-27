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
            String o = "";

            for(int h = 0; h < arr.length; h++){
                if (arr[h].equals("M")){
                    int j = h+1;
                    o += Integer.toString(j);
                    o += " ";
                }
            }
            
            System.out.println(o.substring(0, o.length()-1));
            
        }
    }
}