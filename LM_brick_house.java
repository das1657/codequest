 import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        input.nextLine();
        
        
        for(int i = 0; i < x; i++){ 
            String line = input.nextLine();
            String[] arr = line.split(" ");
            int small = Integer.parseInt(arr[0]);
            int large = Integer.parseInt(arr[1]);
            int target = Integer.parseInt(arr[2]);
           
            int total = 0;
            
            for(int z = 0; z < large; z++){
                if((total+5) <= target){
                    total+=5;
                } else {
                    break;
                }
                
            }
            
            for(int c = 0; c < small; c++){
                if((total+1) <= target){
                    total+=1;
                } else {
                    break;
                }
                
            }
            
            if(total==target){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            
        }
    }
}