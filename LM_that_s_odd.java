import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            int y = scanner.nextInt();
            
            if(y % 2 == 0){
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        }
    }
}