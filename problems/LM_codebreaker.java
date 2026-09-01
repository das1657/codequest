import java.util.*;
import java.text.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        
        for(int i = 0; i < x; i++){
            
            ArrayList<String> allChars = new ArrayList<String>();
            
            int c = scanner.nextInt();
            scanner.nextLine();
            
            for (int z = 0; z < c; z++){
                
                String input = scanner.nextLine();
                input = input.replaceAll("\\s", "");
                
                String finalString = "";
                
                char[] split = input.toCharArray();
                
                for(int t = 0; t < split.length; t++){
                    if (Character.isLetter(split[t])){
                        finalString += split[t];
                    }
                    
                }
                
                finalString = finalString.toUpperCase();
                
                String[] finalSplit = finalString.split("");
                
                
                

                for (int h = 0; h < finalSplit.length; h++){
                    allChars.add(finalSplit[h]);
                    //System.out.println(finalSplit[h]);
                }

            }
            
            int finalLength = allChars.size();
            //System.out.println(finalLength);
            
            String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
            
            for(int t = 0; t < alphabet.length; t++){
                String currentLetter = alphabet[t];
                int count = 0;
                
                for (int v = 0; v < allChars.size(); v++){
                    //System.out.println(allChars.get(v));
                    //System.out.println(allChars.get(v));
                    if (allChars.get(v).equals(currentLetter)){
                        count++;
                    }
                }
                
                double percent = (double)count/(double)finalLength;
                DecimalFormat formatter = new DecimalFormat("0.00%"); 
                String percentageString = formatter.format(percent);
                
                
                System.out.println(currentLetter + ": " + percentageString);
                
                
            }
            
        }
    }
}