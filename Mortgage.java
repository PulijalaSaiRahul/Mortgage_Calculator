import java.text.NumberFormat;
import java.util.*;
public class Mortgage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal:");
        int p=sc.nextInt();

        System.out.println("Enter Annual Interest Rate:");
        float r=sc.nextFloat();

        float mI = r/100/12;

        System.out.println("Enter Period(Yrs):");
        int t=sc.nextInt();
        t=t*12;

        double amount = p*(mI * Math.pow(1 + mI, t))/(Math.pow(1 + mI, t) - 1);

        String ans = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        System.out.println("Mortgage: "+ans);

        sc.close();
    }
}