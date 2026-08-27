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
            
            String num = arr[0];
            String form = arr[1];
            
            if(form.equals("PARENTHESES")){
                String end = "(";
                end += num.substring(0,3) + ") ";
                end += num.substring(3,6) + "-";
                end += num.substring(6);
                
                System.out.println(end);
                
                
            }
            
            if(form.equals("DASHES")){
                String end = "";
                end += num.substring(0,3) + "-";
                end += num.substring(3,6) + "-";
                end += num.substring(6);
                
                System.out.println(end);
                
                
            }
            
            if(form.equals("PERIODS")){
                String end = "";
                end += num.substring(0,3) + ".";
                end += num.substring(3,6) + ".";
                end += num.substring(6);
                
                System.out.println(end);
                
                
            }
            
            
        }
    }
}