import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        
        for (int i = 0; i < x; i++){
            String[] inputs = scanner.nextLine().split(" ");
            
            double diameter = Double.parseDouble(inputs[0]);
            double revForRot = Double.parseDouble(inputs[1]);
            double powReq = Double.parseDouble(inputs[2]);
            double speed = Double.parseDouble(inputs[3]);
            double powCap = Double.parseDouble(inputs[4]);
            double voltReq = Double.parseDouble(inputs[5]);
            double distReq = Double.parseDouble(inputs[6]);
            
            
            double rotationDistance = Math.PI * diameter;
            //System.out.println(rotationDistance);
            double rotsNeeded = (distReq*100)/rotationDistance;
            //System.out.println(rotsNeeded);
            double revsNeeded = rotsNeeded*revForRot;
            //System.out.println(revsNeeded);
            double timeNeeded = revsNeeded/speed;
            //System.out.println(timeNeeded);
            double wattsNeeded = revsNeeded*powReq;
            //System.out.println(wattsNeeded);
            double ampsNeeded = wattsNeeded/voltReq;
            //System.out.println(ampsNeeded);
            double ampereMinutes = ampsNeeded*timeNeeded;
            //System.out.println(ampereMinutes);
            
            double ampereHours = ampereMinutes/60;
            //System.out.println(rotationDistance);
            
            
            if (powCap >= ampereHours){
                String round = String.format("%.4f", timeNeeded);
                System.out.println("Success " + round);
            } else {
                System.out.println("Fail");
                //System.out.println(ampereHours);
            }
            
            
        }
    }
}