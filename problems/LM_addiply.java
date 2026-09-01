import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        //System.out.println("How many times to addiply?");
        int times = s.nextInt();
        String str = s.nextLine();
        
        for(int i = 0; i < times; i++){

        //System.out.println("Input your split numbers");
        
        str = s.nextLine();
        
        
        String[] splitArray = str.split(" ");
        
       // System.out.println(Arrays.toString(splitArray));
        
        int num1 = Integer.parseInt(splitArray[0]);
        int num2 = Integer.parseInt(splitArray[1]);
        
        System.out.print(num1 + num2);
        System.out.print(" ");
        System.out.println(num1 * num2);
        
        
        }
    }
}