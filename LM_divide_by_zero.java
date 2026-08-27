import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < x; i++){
            
            String y = scanner.nextLine();
            
            String[] arr = y.split(" ");
            String alphabet = "abcdefghijklmnopqrstuvwxyz`-=[]\',./";
            String alphabet2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ~_+{}|:<>>?";
            
            boolean fail = false;
            
            for (int z = 0; z < 1; z++){
                for(int c = 0; c < alphabet.length(); c++){
                    if (arr[0].substring(z,z+1).equals(alphabet.substring(c,c+1)) || arr[0].substring(z,z+1).equals(alphabet2.substring(c,c+1))){
                        System.out.println("Invalid Dividend");
                        fail = true;
                        break;
                    }
                    
                }
            }
            
            for (int a = 0; a < 1; a++){
                for(int g = 0; g < alphabet.length(); g++){
                    if (arr[1].substring(a,a+1).equals(alphabet.substring(g,g+1)) || arr[1].substring(a,a+1).equals(alphabet2.substring(g,g+1))){
                        System.out.println("Invalid Divisor");
                        fail = true;
                        break;
                    } else if (arr[1].substring(0,1).equals("0")){
                        System.out.println("Divide By Zero");
                        fail = true;

                        
                        break;
                    }
                    
                }
            }
            
            
            
            
            if (fail == false){
                double a = Double.parseDouble(arr[0]);
                double b = Double.parseDouble(arr[1]);
            
                System.out.println(a/b); 
            }

            
            
            
        }
        
    }
}