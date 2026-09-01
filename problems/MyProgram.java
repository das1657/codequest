import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        
        for(int i = 0; i < x; i++){
            String[] arrletters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            String code = scanner.nextLine();
            
            ArrayList<String> arr = new ArrayList<String>();
            String[] codearr = code.split("");
            
            for(int j = 0; j < codearr.length; j++){
                String save = "";
                //String validnum = "1234567890"
                if((codearr[j].equals("0") || codearr[j].equals("1") || codearr[j].equals("2") || codearr[j].equals("3") || codearr[j].equals("4") || codearr[j].equals("5") || codearr[j].equals("6") || codearr[j].equals("7") || codearr[j].equals("8") || codearr[j].equals("9"))){
                    save += codearr[j];
                    
                    if((j+1) >= codearr.length){
                        
                        //nothing
                    
                    } else {
                        if ((codearr[j+1].equals("0") || codearr[j+1].equals("1") || codearr[j+1].equals("2") || codearr[j+1].equals("3") || codearr[j+1].equals("4") || codearr[j+1].equals("5") || codearr[j+1].equals("6") || codearr[j+1].equals("7") || codearr[j+1].equals("8") || codearr[j+1].equals("9"))){
                            save += codearr[j+1];
                            j++;
                        }
                    }
                }

                
                if (save.equals("")){
                    //nothing wuh oh uh oh!!!!
                } else {
                    arr.add(save);
 
                }
            }
            
            String decipher = "";
            for(int g = 0; g < arr.size(); g++){
                decipher += arrletters[Integer.parseInt(arr.get(g))-1];
            }
            System.out.println(decipher);
            
            
            
        }
        
    }
}