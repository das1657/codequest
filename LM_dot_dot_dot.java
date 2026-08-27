import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i = 0; i < x; i++){
            int dots = 0;
            
            String word = scanner.nextLine();
            
            for(int z = 0; z < word.length(); z++){
                
                for(int g = 0; g < alphabet.length(); g++){
                    if(word.substring(z,z+1).equals(alphabet.substring(g,g+1))){
                        dots+=g+1;
                        continue;
                    }
                }
                
            }
            
            System.out.println(dots);
            
            
        }
    }
}