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
            scanner.nextLine();
            
            String a1 = scanner.nextLine();
            String a2 = scanner.nextLine();
            
            String[] arr1 = a1.split(" ");
            String[] arr2 = a2.split(" ");
            
            double count1 = 0.0;
            double count2 = 0.0;
            
            for(int g = 0; g < arr1.length; g++){
                count1 += Double.parseDouble(arr1[g]);
                count2 += Double.parseDouble(arr2[g]);

            }
            
            count1 /= 6;
            count2 /= 6;
            
            System.out.printf("%.2f",count2-count1);
            System.out.println("");


            
            
            
        }
    }
}