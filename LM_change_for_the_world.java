import java.util.*;
import java.math.BigDecimal;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < x; i++){
            String moneys = input.nextLine();
            BigDecimal money = new BigDecimal(moneys.substring(1));
            
            int quarters = 0;
            int dimes = 0;
            int nickels = 0;
            int pennies = 0;
            
            BigDecimal quarter = new BigDecimal("0.25");
            BigDecimal dime = new BigDecimal("0.10");
            BigDecimal nickel = new BigDecimal("0.05");
            BigDecimal penny = new BigDecimal("0.01");
            BigDecimal zero = new BigDecimal("0.00");


            
            while ((money.subtract(quarter).compareTo(zero) == 1) || (money.subtract(quarter).compareTo(zero) == 0)){
                quarters++;
                
                //BigDecimal newMoney1 = new BigDecimal(String.valueOf(money));
                
                money = money.subtract(quarter);
                //System.out.println(money);

            }

            while ((money.subtract(dime).compareTo(zero) == 1) || (money.subtract(dime).compareTo(zero) == 0)){
                dimes++;
                //BigDecimal newMoney2 = new BigDecimal(String.valueOf(money));
            
                money = money.subtract(dime);
                //System.out.println(money);

            }
            
            while ((money.subtract(nickel).compareTo(zero) == 1) || (money.subtract(nickel).compareTo(zero) == 0)){
                nickels++;
                //BigDecimal newMoney3 = new BigDecimal(String.valueOf(money));
                money = money.subtract(nickel);
                //System.out.println(money);

            }

            while ((money.subtract(penny).compareTo(zero) == 1) || (money.subtract(penny).compareTo(zero) == 0)){
                pennies++;
                //BigDecimal newMoney4 = new BigDecimal(String.valueOf(money));
                money = money = money.subtract(penny);
                //System.out.println(money);
            }
            System.out.println(moneys);
            System.out.println("Quarters=" + quarters);
            System.out.println("Dimes=" + dimes);
            System.out.println("Nickels=" + nickels);
            System.out.println("Pennies=" + pennies);


            
            
        }
    }
}