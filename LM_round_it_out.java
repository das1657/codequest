import java.util.*;
import java.math.*;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < x; i++){
            String[] input = scanner.nextLine().split(" ");
            
            String numIn = input[0];
            String mode = input[1];
            int amt = Integer.parseInt(input[2]);
            
            
            if (mode.equals("HU")){
                BigDecimal num = new BigDecimal(numIn);
                BigDecimal rounded = num.setScale(amt, RoundingMode.HALF_UP);
                rounded = rounded.stripTrailingZeros();
                System.out.println(rounded.toPlainString());
            }
            
            
            if (mode.equals("HD")){
                BigDecimal num = new BigDecimal(numIn);
                BigDecimal rounded = num.setScale(amt, RoundingMode.HALF_DOWN);
                rounded = rounded.stripTrailingZeros();
                System.out.println(rounded.toPlainString());
            }
            
            if (mode.equals("U")){
                BigDecimal num = new BigDecimal(numIn);
                BigDecimal rounded = num.setScale(amt, RoundingMode.UP);
                rounded = rounded.stripTrailingZeros();
                System.out.println(rounded.toPlainString());
            }
            
            if (mode.equals("D")){
                BigDecimal num = new BigDecimal(numIn);
                BigDecimal rounded = num.setScale(amt, RoundingMode.DOWN);
                rounded = rounded.stripTrailingZeros();
                System.out.println(rounded.toPlainString());
            }
            
            if (mode.equals("HE")){
                BigDecimal num = new BigDecimal(numIn);
                BigDecimal rounded = num.setScale(amt, RoundingMode.HALF_EVEN);
                rounded = rounded.stripTrailingZeros();
                System.out.println(rounded.toPlainString());
            }
            
            if (mode.equals("HO")){
                BigDecimal num = new BigDecimal(numIn);
                String[] extract = numIn.split("\\.");
                double integer = Double.parseDouble(extract[0]);
                double decimalPart = Double.parseDouble(extract[1]);
                BigDecimal rounded;
                
                if (amt <= -1){
                    rounded = num.setScale(amt, RoundingMode.HALF_UP);
                    rounded = rounded.stripTrailingZeros();
                    System.out.println(rounded.toPlainString());
                    continue;
                }
                
                int numToCheck = Integer.parseInt(extract[1].substring(amt,amt+1));
                
                if (numToCheck == 5){
                    if (integer % 2 == 0){
                        rounded = num.setScale(amt, RoundingMode.UP);
                    } else {
                        rounded = num.setScale(amt, RoundingMode.DOWN);
                    }
                } else {
                    rounded = num.setScale(amt, RoundingMode.HALF_UP);
                }
                
                rounded = rounded.stripTrailingZeros();
                System.out.println(rounded.toPlainString());
                
            }
            
            
        }
    }
}