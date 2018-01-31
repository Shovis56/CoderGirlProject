import static java.lang.System.out;
import java.util.Scanner;

public class SanddwichShop
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is 50.");
        out.println("How many veggie sandwiches were sold today?");

        int goalForVeggies;
        goalForVeggies = keyboard.nextInt();

        if (goalForVeggies >= 50) {
            out.println("Made goal for veggies.");
        } else {
            out.println("Fell short for veggies.");
        }
        out.println("The sales goal for burgers is 250.");
        out.println("How many burgers were sold today?");
        int goalForBurgers;
        goalForBurgers = keyboard.nextInt();

        if (goalForBurgers >= 250) {
            out.println("Made goal for burgers.");}

         else {out.println("Fell short for burgers.");}

         out.println("The sales goal for subs is 180.");
         out.println("How many subs were sold today?");

         int goalForSubs;
        goalForSubs = keyboard.nextInt();

        if (goalForSubs >= 180) {
            out.println("Made goal for subs.");}

        else {out.println("Fell short for subs.");}

        out.println("The sales goal for soups is 70.");
        out.println("How many soups were sold today?");

        int goalForSoup;
        goalForSoup = keyboard.nextInt();

        if (goalForSoup >= 70) {
            out.println("Made goal for soup.");}

            else {out.println("Fell short for soup.");}



        if ( goalForVeggies + goalForBurgers + goalForSoup + goalForSubs >= 550 )
        {out.println("Made goal for everything!");}

    }

}