import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            //System.out.println(words[1]);
            
            String[] mispell = words[0].split("");
            String[] correct = words[1].split("");

            if(mispell[0].equals(correct[0]) && mispell[mispell.length-1].equals(correct[correct.length-1])){
                
                boolean j = true;
                for(int t = 0; t < mispell.length-1; t++){
                    boolean g = false;
                    for(int y = 0; y < correct.length-1; y++){
                        
                        if(mispell[t].equals(correct[y])){
                            g = true;
                        }
                    }
                    
                    if (g = false){
                        j = false;
                    }
                }
                
                if(j){
                    System.out.println(words[1]);
                } else {
                    System.out.println(words[0]);
                }
                
            } else {
                System.out.println(words[0]);

            }
            

            
            
            
        }
    }
}