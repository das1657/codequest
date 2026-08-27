import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            
            
            String str = scanner.nextLine();
            String arr[] = str.split(" ");
            
            
            
            int alump = Integer.parseInt(arr[0]);
            int plasticp = Integer.parseInt(arr[1]);
            int glassp = Integer.parseInt(arr[2]);
            
            double alum = alump*31;
            double plastic = plasticp*15;
            double glass = glassp/2;
            
            double cash = (alum*0.05) + (plastic*0.10) + (glass*0.20);
            
            double cents = cash%10;
           
            System.out.print("$");  
            System.out.printf("%.2f", cash);
            System.out.println("");
            
           
            
            
        }
        
    }
}