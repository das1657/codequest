import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        
        for(int i = 0; i < x; i++){
            
            int input = scanner.nextInt();
            boolean found = false;
            int sequence = 0;
            int f0 = 0; // 1 2 3 5
            int f1 = 1; // 1 1 2 3
            int save = 0;
            
            while(input+100 > f1){
                
                if (f0 == input || f1 == input){
                    found = true;
                }
                
                //System.out.println(f0);
                
                save = f0;
                f0 = f0+f1;
                f1 = save;
                
            }
            
            
            if (found){
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }
            
            
        
        
        }
        
    }
}