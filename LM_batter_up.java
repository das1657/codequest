import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String y = scanner.nextLine();
            //System.out.println(y);
            int colonpos = 0;
            
            for(int q = 0; q < y.length(); q++){
                //System.out.println("A");
                //System.out.println(y.substring(q,q+1));
                if(y.substring(q,q+1).equals(":")){
                    //System.out.println("found");
                    colonpos = q;
                }
            }
            //System.out.println(y.substring(colonpos));
            String[] arr = y.substring(colonpos+1).split(",");
            double denominator = 0.000000;
            double numerator = 0.000000;
            
            for(int j = 0; j < arr.length; j++){
                if(arr[j].equals("BB")){
                    //nothing
                }
                if(arr[j].equals("K")){
                    numerator += 0;
                    denominator++;
                }
                if(arr[j].equals("1B")){
                    numerator += 1;
                    denominator++;
                }
                if(arr[j].equals("2B")){
                    numerator += 2;
                    denominator++;
                }
                if(arr[j].equals("3B")){
                    numerator += 3;
                    denominator++;
                }
                if(arr[j].equals("HR")){
                    numerator += 4;
                    denominator++;
                }
                
            }
            
            String finalval = "0.000";
            
            double bfinalval = (numerator/denominator);
            //System.out.println(numerator);
            //System.out.println(denominator);
            //System.out.println(numerator/denominator);


            
            if(denominator != 0){
                finalval = String.format("%.3f", bfinalval);
            }
            
            System.out.println(y.substring(0,colonpos) + "=" + finalval);
            
            
        }
        
    }
}