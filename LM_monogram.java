import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < x; i++){
            int names = input.nextInt();
            input.nextLine();
            
            for(int t = 0; t < names; t++){
                String name = input.nextLine();
                String first = name.substring(0,1);
                
                for(int f = 1; f < name.length(); f++){
                    if (name.substring(f,f+1).equals(" ")){
                        first += name.substring(f+1,f+2);
                    }
                }
                
                String second = first.substring(0,1) + first.substring(2,3) + first.substring(1,2);
                System.out.println(second.toUpperCase());
                
                
            }
        }
    }
}