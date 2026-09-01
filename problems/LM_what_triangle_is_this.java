import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < x; i++){
            String input = scanner.nextLine();
            
            int s1 = 0;
            int s2 = 0;
            int s3 = 0;
            
            String[] arr = input.split(",");
            
            s1 = Integer.parseInt(arr[0].substring(0,arr[0].length()));
            s2 = Integer.parseInt(arr[1].substring(1,arr[1].length()));
            s3 = Integer.parseInt(arr[2].substring(1,arr[2].length()));
            
            //System.out.println(s1);
            //System.out.println(s2);
            //System.out.println(s3);
            
            boolean isTriangle = true;
            
            
            
            if(((s1+s2) >= s3) && ((s3+s2) >= s1) && ((s3+s1) >= s2)){

            } else {
                System.out.println("Not a Triangle");
                continue;
            }
    
            if((s1 == s2) && (s2 == s3)){
                System.out.println("Equilateral");
                continue;
            }
            
            if((s1 == s2) || (s1 == s3) || (s2 == s3)){
                System.out.println("Isosceles");
                continue;
            }
            
            if((s1 != s2) && (s1 != s3) && (s2 != s3) && (s2 != s1) && (s3 != s2) && (s3 != s1)){
                System.out.println("Scalene");
                continue;
            }
            


        }
    }
}