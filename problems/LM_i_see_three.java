import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String nums = scanner.nextLine();
            
            String[] arr = nums.split(" ");
            int max = 0;
            for(int t = 0; t < arr.length; t++){
                String num = arr[t];
                
                    for(int g = 0; g < arr.length; g++){
                        
                        if(num.equals(arr[g])){
                            max++;
                        }
                }
                if (max == 3){
                    System.out.println("TRUE");
                    break;
                } else {
                    max = 0;
                    //System.out.println("FALSE");
                }

                
                
            }
            
            if (max == 0){
                System.out.println("FALSE");
            }
            
        }
        

    }
}