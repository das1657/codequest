import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < x; i++){
            int max = 0;
            String phrase = scanner.nextLine();
            
            for (int j = 0; j < phrase.length(); j++){
                String letter = phrase.substring(j, j+1);
                int tmax = 0;
                for (int k = 0; k < phrase.length(); k++){
                    
                    
                    if(letter.equals(phrase.substring(k,k+1))){
                        tmax += 1;
                        if (letter.equals(" ")){
                            tmax = 0;
                        } else {
                            if (tmax > max){
                                //max = tmax;
                            }
                        }
                    }
                }
                
                if (tmax > max){
                    max = tmax;
                }
            }
            
            System.out.println(max);
        }
    }
}