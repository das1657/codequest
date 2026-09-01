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
            
            for(int e = 0; e < y; e++){
                int year = scanner.nextInt();
                
                if(year < 1582){
                    System.out.println("No");
                } else if(year%4 != 0){
                    System.out.println("No");
                } else if(year%100 != 0){
                    System.out.println("Yes");
                } else if(year%400 != 0){
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
                
            }
        }
    }
}