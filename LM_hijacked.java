import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();

        
        for(int i = 0; i < x; i++){
            int msglength = scanner.nextInt();
            scanner.nextLine();
            String msg = scanner.nextLine();
            
            ArrayList<String> strings = new ArrayList<String>();
            
            String code = "";
            int codeIndex = 0;
            int codeReverseIndex = 0;
        
                
            for(int c = 0; c < msg.length()-2; c++){
                
                
                
                String tempCode = msg.substring(c,c+3);
                
                
                if((tempCode.substring(0,1).equals("0"))||(tempCode.substring(0,1).equals("1"))||(tempCode.substring(0,1).equals("2"))||(tempCode.substring(0,1).equals("3"))||(tempCode.substring(0,1).equals("4"))||(tempCode.substring(0,1).equals("5"))||(tempCode.substring(0,1).equals("6"))||(tempCode.substring(0,1).equals("7"))||(tempCode.substring(0,1).equals("8"))||(tempCode.substring(0,1).equals("9"))){
                    c+=1;
                    continue;
                }

                
                //System.out.println(tempCode);
                String tempCodeReverse = new StringBuilder(tempCode).reverse().toString();
                    
                for(int v = 0; v < msg.length()-2; v++){
                    //System.out.println(msg.substring(v,v+3));
                    if(msg.substring(v,v+3).equals(tempCodeReverse)){
                        code = tempCode;
                        codeIndex = c+3;
                        codeReverseIndex = v;
                        //System.out.println("found");
                        //System.out.println(code);
                        strings.add(msg.substring(codeIndex, codeReverseIndex));
                        c = codeReverseIndex;
                        //continue;
                        
                    }
                }
                    
                    
            }
            
            
            for(int b = 0; b < strings.size(); b++){
                String selected = strings.get(b);
                
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
                
                
                
                
                System.out.println(newString);
                
            }

            
            
            
            //String inBetween = msg.substring(codeIndex, codeReverseIndex);

            
                

            
            //System.out.println(inBetween);
            
            

            

            
            
        }
        
    }
}