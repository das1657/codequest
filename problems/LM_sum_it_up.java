import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < x; i++){
            String num = scanner.nextLine();
            
            String[] arraynum = num.split(" ");
            
            if (Integer.parseInt(arraynum[0]) != Integer.parseInt(arraynum[1])){
                System.out.println(Integer.parseInt(arraynum[0]) + Integer.parseInt(arraynum[1]));
            } else {
                System.out.println((Integer.parseInt(arraynum[0]) + Integer.parseInt(arraynum[1])) * 2);
            }
        }
        
    }
}