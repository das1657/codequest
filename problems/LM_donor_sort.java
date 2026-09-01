import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String last = scanner.nextLine();
            String now = scanner.nextLine();
            
            String[] lastnames = last.split(",");
            String[] nownames = now.split(",");
            
            Arrays.sort(lastnames);
            Arrays.sort(nownames);
            
            String newnames = "";
            
            for(int j = 0; j < lastnames.length; j++){
                boolean found = false;
                for(int k = 0; k < nownames.length; k++){
                    if(lastnames[j].equals(nownames[k])){
                        found = true;
                    } else {
                        
                        //newnames += lastnames[j] + ",";
                        

                    }

                }
                
                if(found == false){
                    newnames += lastnames[j] + ",";
                }
            }
            
            System.out.println(newnames.substring(0,newnames.length()-1));
            newnames = "";

            for(int j = 0; j < lastnames.length; j++){
                boolean found = false;
                for(int k = 0; k < nownames.length; k++){
                    if(lastnames[j].equals(nownames[k])){
                        found = true;
                    } else {
                        
                        //newnames += lastnames[j] + ",";
                        

                    }

                }
                
                if(found == true){
                    newnames += lastnames[j] + ",";
                }
            }
            
            System.out.println(newnames.substring(0,newnames.length()-1));
            newnames = "";
            
            for(int j = 0; j < nownames.length; j++){
                boolean found = false;
                for(int k = 0; k < lastnames.length; k++){
                    if(nownames[j].equals(lastnames[k])){
                        found = true;
                    } else {
                        
                        //newnames += lastnames[j] + ",";
                        

                    }

                }
                
                if(found == false){
                    newnames += nownames[j] + ",";
                }
            }
            
            System.out.println(newnames.substring(0,newnames.length()-1));

            
        }
    }
}