import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String l = scanner.nextLine();
            String msg = "";
            for (int t = 1; t < l.length(); t++){
                if (l.substring(t-1, t).equals("a") || l.substring(t-1, t).equals("e") || l.substring(t-1, t).equals("i") || l.substring(t-1, t).equals("o") || l.substring(t-1, t).equals("u")){
                    msg += l.substring(t,t+1);
                    t++;
                }
                
            }
            
            System.out.println(msg);
            
        }
    }
}