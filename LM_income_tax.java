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
            if (0 <= num && num <= 11000){
                System.out.println((int) Math.round(num*0.1));
            } else if (11001 <= num && num <= 44725){
                System.out.println((int) Math.round(num*0.12));
            } else if (44726 <= num && num <= 95375){
                System.out.println((int) Math.round(num*0.22));
            } else if (95376 <= num && num <= 182100){
                System.out.println((int) Math.round(num*0.24));
            } else if (182101 <= num && num <= 231250){
                System.out.println((int) Math.round(num*0.32));
            } else if (231251 <= num && num <= 578125){
                System.out.println((int) Math.round(num*0.35));
            } else {
                System.out.println((int)Math.round(num*0.37));
            }
        }
        
    }
}