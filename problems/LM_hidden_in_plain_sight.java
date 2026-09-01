import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        
        
        for(int i = 0; i < x; i++){
            String builtMessage = "";
            int lines = scanner.nextInt();
            scanner.nextLine();
            

            for (int t = 0; t < lines; t++){
                String input = scanner.nextLine();
                //inputs.add(input);
                int key = input.indexOf("|");
                int extractedIndex = Integer.parseInt(input.substring(key + 1));
                
                builtMessage = builtMessage + input.charAt(extractedIndex);
                

            }
            
            
            
            
            
            
            /*
            for(int b = 0; b < inputs.size(); b++){
                System.out.println(inputs.get(b));
                String[] splitted = inputs.get(b).split("\\|");
                System.out.println(splitted[0]);
            }
            */
            
            
            /*
            for (int g = 0; g < inputs.size(); g++){
                //String[] splitted = inputs.get(g).split("\\|");
                String current = inputs.get(g);
                int key = current.indexOf("\\|");
                
                int extractedIndex = Integer.parseInt(current.substring(key));
                
                //System.out.println(extractedIndex);
                
                builtMessage = builtMessage + current.charAt(extractedIndex);
                
            }
            */
            
            
            System.out.println(builtMessage);
        }
        
    }
}