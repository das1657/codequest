import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int times = s.nextInt();
        s.nextLine();
        
        for(int i = 0; i < times; i++){
           // System.out.println("What is your vehicle speed?");
            
            String sad = s.nextLine();
            //System.out.println("What is your distance?");
            //double distance = s.nextDouble();
            String[] arr = sad.split(":");
            
            double speed = Double.parseDouble(arr[0]);
            double distance = Double.parseDouble(arr[1]);

            
            
            
            if(distance - speed <= 0){
                System.out.println("SWERVE");
            } else if(distance - (speed*5) <= 0){
                System.out.println("BRAKE");
            } else {
                System.out.println("SAFE");
            }
        }
    }
}