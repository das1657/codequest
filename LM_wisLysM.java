import java.util.*;


public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        input.nextLine();
        for (int i = 0; i < testCase; i++) {
            int num = input.nextInt();
            
            if((num%3==0)&&(num%7==0)){
                System.out.println("LOCKHEEDMARTIN");
            } else if((num%3==0)) {
                System.out.println("LOCKHEED");
            } else if((num%7==0)){
                System.out.println("MARTIN");
            } else {
                System.out.println(num);
            }
            
        }
        
    }
}