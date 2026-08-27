import java.util.*;


public class MyProgram
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        
        for(int i = 0; i < x; i++){
            int msgLength = scanner.nextInt();
            scanner.nextLine();
            

            
            
            String msg = scanner.nextLine();
            
            if (msgLength <= 6){
                continue;
            }
            
            ArrayList<String> strings = new ArrayList<String>();

            
            for(int c = 0; c < msg.length()-2; c++){
                
                int firstIndex = c+3;
                int lastIndex = 0;
                
                String tempCode = msg.substring(c,c+3);
                String tempCodeReverse = new StringBuilder(tempCode).reverse().toString();
                //System.out.println(tempCode);
                
                for(int v = firstIndex; v < msg.length()-2; v++){
                    if(msg.substring(v,v+3).equals(tempCodeReverse) && v != c){
                        lastIndex = v;
                        //System.out.println(tempCode);
                        
                        strings.add(msg.substring(firstIndex,lastIndex));
                        c=v;
                        
                    }
                }
                
                
                
            }
            
            
            for(int b = 0; b < strings.size(); b++){
                //System.out.println(strings.get(b));
            }
            
            
            for(int b = 0; b < strings.size(); b++){
                String selected = strings.get(b);
                

                if(selected.length() <= 2){
                    System.out.print(selected);
                    continue;
                }
                
                //System.out.println(selected);
                
                ArrayList<String> arr = new ArrayList<String>();
                
                for(int k=0; k < selected.length(); k++){
                    arr.add(selected.substring(k,k+1));
                }
                

                String newString = "";
                
                for(int l=0; l<arr.size()-1;l++){
                    if(arr.get(l).equals(arr.get(l+1))){
                        newString+= arr.get(l+1);
                        l++;
                    } else {
                        newString += arr.get(l);
                    }
                    
                }
                
                
                newString += selected.substring(selected.length()-1);
                
                
                
                if (newString.equals("")){
                    //nothing
                } else {
                System.out.println(newString);
  
                }
                
            }
            
            

            
            
        }
        
        
        
        
    }
}