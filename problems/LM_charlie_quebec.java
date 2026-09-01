import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        String[] words = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "Xray", "Yankee", "Zulu"};
        
        
        
        for(int i = 0; i < x; i++){
            
            int y = scanner.nextInt();
            scanner.nextLine();
            
            for(int t = 0; t < y; t++){
                String text = scanner.nextLine().toUpperCase();
                String newtext = "";
                
                for(int g = 0; g < text.length(); g++){
                    String letter = text.substring(g,g+1);
                    
                    if(letter.equals(" ")){
                        newtext = newtext.substring(0, newtext.length()-1);
                        newtext = newtext + " ";
                        continue;
                    }
                    
                    for(int v = 0; v < words.length; v++){
                        if (letter.equals(words[v].substring(0,1))){
                            newtext = newtext + words[v] + "-";
                            break;
                        }
                    }
                    
                }
                
                System.out.println(newtext.substring(0, newtext.length()-1));
                
            }
            
            
            
        }
    }
}