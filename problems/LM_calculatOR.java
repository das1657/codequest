import java.util.*;


public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String y = scanner.nextLine();
            
            String[] arr = y.split(" ");
            
            double a = Double.parseDouble(arr[0]);
            double b = Double.parseDouble(arr[2]);
            
            if(arr[1].equals("+")){
                System.out.print(String.format("%.1f", a + b));
                System.out.print(" ");
                System.out.println(String.format("%.1f", b  a));
            }
            
            if(arr[1].equals("-")){
                System.out.print(String.format("%.1f", a - b));
                System.out.print(" ");
                System.out.println(String.format("%.1f", b - a));
            }
            
            if(arr[1].equals("*")){
                System.out.print(String.format("%.1f", a * b));
                System.out.print(" ");
                System.out.println(String.format("%.1f", b * a));
            }
            
            if(arr[1].equals("/")){
                System.out.print(String.format("%.1f", a / b));
                System.out.print(" ");
                System.out.println(String.format("%.1f", b / a));
            }

            
            
        }
    }
}