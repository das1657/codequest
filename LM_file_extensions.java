import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<String> extension = new ArrayList<String>();

        
        for(int i = 0; i < x; i++){
            String y = scanner.nextLine();
            
            //ArrayList<String> arr = new ArrayList<String>();
            
            
            String[] splitted = y.split("\\.");
            //System.out.println(splitted[0]);
            

            extension.add(splitted[1]);
            
            
            
            
        }
        
        ArrayList<String> did = new ArrayList<String>();

        for(int i = 0; i < extension.size(); i++){

            boolean found = false;
            for(int t = 0; t < did.size(); t++){
                if(extension.get(i).equals(did.get(t))){
                    found = true;
                }
            }
            
            if (found){
                //nothing
            } else {
                System.out.println(extension.get(i) + " " + Collections.frequency(extension,extension.get(i)));
                did.add(extension.get(i));
            }
            found = false;
            

        }
    }
}