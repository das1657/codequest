import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        ArrayList<String> systems = new ArrayList<String>();
        ArrayList<String> fixedsys = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        
        int times = input.nextInt();
        
        input.nextLine();
        
        
        for(int k = 0; k < times; k++){
        
            //System.out.println("Give me 2 ints, separated by a space, the first int is the # of systems and the second int is the # of working systems");
            String numbers = input.nextLine();
            String[] numarr = numbers.split(" ");
            int numsys = Integer.parseInt(numarr[0]);
            int numsysfix = Integer.parseInt(numarr[1]);
    
            for(int i = 0; i < numsys; i++){
                //System.out.println("System #" + (i+1) + ":");
                systems.add(input.nextLine());
            }
            
            for(int i = 0; i < numsysfix; i++){
                //System.out.println("Fixed System #" + (i+1) + ":");
                fixedsys.add(input.nextLine());
            }
            
            System.out.println(" ");
            
            
            for (int i = 0; i < systems.size(); i++){
                for (int j = 0; j < fixedsys.size(); j++){
                    if (systems.get(i).equals(fixedsys.get(j))){
                        systems.remove(i);
                    }
                }
                
            }
            
            systems.sort(String.CASE_INSENSITIVE_ORDER);
            
            for(int i = 0; i < systems.size(); i++){
                System.out.println(systems.get(i));
            }
        
        }
        
        
    
    }
}