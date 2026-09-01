import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        String[] vowels = {"a","e","i","o","u"};
        
        for(int i = 0; i < x; i++){
            String y = scanner.nextLine();
            int num = 0;
            
            for(int c = 0; c < y.length(); c++){
                
                for(int m = 0; m < vowels.length; m++){
                    if(y.substring(c,c+1).equals(vowels[m])){
                        num++;
                    }
                }
            }
            
            System.out.println(num);
            
        }
        
    }
}