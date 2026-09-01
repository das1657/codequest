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
           
           int n1 = Integer.parseInt(arr[0]);
           int n2 = Integer.parseInt(arr[1]);
           int n3 = Integer.parseInt(arr[2]);
           
           if((n1+n2) == n3){
               System.out.println("Addition");
               continue;
           }
           if((n1-n2) == n3){
               System.out.println("Subtraction");
               continue;
           }
           if((n1*n2) == n3){
               System.out.println("Multiplication");
                              continue;
           }
           if((n1/n2) == n3){
               System.out.println("Division");
                              continue;
           }
            if((n1%n2) == n3){
               System.out.println("Modulo");
                              continue;
           }
           
           
       }
       
    }
}