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
            
            String[] arr = input.split("\\|");
                        //System.out.println(arr[1]);
                        //System.out.println(arr[0]);

            boolean isGood = true;
            
            for(int k = 0; k < arr[0].length(); k++){
                

                
                String letter = String.valueOf(arr[0].charAt(k));
                int check1 = 0;
                int check2 = 0;
                
                for(int c = 0; c < arr[0].length(); c++){
                    if (letter.equals(String.valueOf(arr[0].charAt(c)))){
//System.out.println("found1" + arr[0].charAt(c));
//System.out.println(c);
                        check1++;
                    }
                }
                
                for(int b = 0; b < arr[1].length(); b++){
                    if (letter.equals(String.valueOf(arr[1].charAt(b)))){
                        check2++;
//System.out.println("found2" + arr[0].charAt(b));

                    }
                }
                
                if (check1 == check2){
                    isGood = true;
                } else {
                    isGood = false;
                }
                
                
                
                
                
                
                
            }
            
                if (arr[0].equals(arr[1])){
                    isGood = false;
                }
            
            String output = input + " = ";
            if (isGood){
                output += "ANAGRAM";
            } else {
                output += "NOT AN ANAGRAM";
            }
            
            System.out.println(output);
            
            
        }
    }
}