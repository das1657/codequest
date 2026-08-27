import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        //input.nextLine();
        
        for(int i = 0; i < x; i++){
            int y = input.nextInt();
            int max = 0;
            
            max = (int) Math.pow(2,y) -1;
            //System.out.println(max);
            
            int num = 0;
            
            while(num <= max){
                
                String snum = (Integer.toBinaryString(num));
                
                if (snum.length() != y){
                    for(int t = 0; t < (y-snum.length()); t++){
                        System.out.print("0");
                    }
                }
                
                
                
                System.out.println(Integer.toBinaryString(num));
                num++;
            }
        }
    }
}