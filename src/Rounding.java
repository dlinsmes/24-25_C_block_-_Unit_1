import java.util.Scanner;

public class Rounding {
    public static void main(String [] args) {

        //implement the normal rounding rule -
        //if the decimal is .5 or higher, the int value goes up
        //otherwise the int value stays the same
        double num = 9.9;

        //cast (convert) from a double to an int
        int n = (int)(num);
        //casting will truncate (cut off) any decimals
        System.out.println("n is " + n);

        //add .5 AND THEN cast
        //-this works bc if the initial decimal value is .5 or higher,
        //the sum will affect the int value, then casting to an int will
        //truncate any decimals
        //-if the initial decimal is less than .5, then adding .5 WILL NOT
        //change the int value, then casting to an int will truncate any
        //decimals
        int rounded = (int)(num + .5);
        System.out.println("rounded is " + rounded);

        //int division
        //any decimals are truncated
        //7
        int a = 37 / 5;
        System.out.println("37 / 5 is " + a);

        //modulo gives the remainder after division
        // 2
        int b = 37 % 5;
        System.out.println("37 % 5 is " + b);

        //assignment operator - first evaluate what's on the RIGHT
        //7 and 2 are both ints bc there's no decimal so 7/2 is 3
        //THEN save the evaluation to the left --> 3 becomes 3.0

        //for double division, make sure at least one of the terms
        //is a double by adding .0
        double c = 7 / 2;
        System.out.println("7 / 2 as a double is " + c);

        //should be 7.5
        c = 9.7 - 2.2;
        System.out.println("9.7 - 2.2 is " + c);
        //doubles are an approximation of decimal numbers
        //-sometimes the value is extremely close, but off by
        //some small amount

        c = 9.7 - 2.1;
        System.out.println("9.7 - 2.1 is " + c);

        c = 47.49 % 1;
        System.out.println("47.49 % 1 is " + c);

        //round to a particular decimal
        //should be 7.5
        c = 9.7 - 2.2;

        //round to 7.5

        //move the decimal to the place value you want to keep
        //THEN round, then move the decimal back
        c = c * 10; // 74.999999....
        int cRounded = (int)(c + .5); //rounds to 75
        c = cRounded / 10.0; //use double division to move the decimal back
        System.out.println(c);

        //should be 0.49
        c = 47.49 % 1;
        c = c * 100; //49.0000002
        cRounded = (int)(c + .5); //49
        c = cRounded / 100.0; //0.49
        System.out.println("c is " + c);

        //cash register
        //prompt the user for some dollar and cent value
        //then calculate the minimum quantity of bills and coins
        //to add up to that amount
        //bill denominations are 100, 20, 10, 5, 1
        //coins are quarters, dimes, nickels, pennies

        //use ONLY division, modulo, and rounding
        //(no multiplication, subtraction, ifs, loops)

        Scanner input = new Scanner(System.in);
        System.out.println("enter a dollar and cent value as a double");
        double amt = input.nextDouble();

        //start with largest bill value, then move down

        //use an int for quantity bc you can't have a fraction of a bill
        int h = (int)(amt/100);
        System.out.println(h + " $100 bills");

        //use mod to solve for the remaining amount to calculate
        amt = amt % 100;

        int twenties = (int)(amt/20);
        System.out.println(twenties + " $20 bills");
        amt = amt % 20;

        int tens = (int)(amt/10);
        System.out.println(tens + " $10 bills");
        amt = amt % 10;

        int f = (int)(amt/5);
        System.out.println(f + " $5 bills");
        amt = amt % 5;

        int o = (int)(amt/1);
        System.out.println(o + " $1 bills");
        amt = amt % 1;

        //multiply the remaining cent amount by 100 to get an int and round, then use int div/mod
        //easier and less tedious than rounding each coin quantity from a double

        amt = amt * 100; //24.99999
        int cents = (int)(amt + 0.5); //25

        int q = cents/25;
        System.out.println(q + " quarters");
        cents = cents % 25;

        int d = cents / 10;
        System.out.println(d + " dimes");
        cents = cents % 10;

        int nick = cents / 5;
        System.out.println(nick + " nickels");
        cents = cents % 5;

        System.out.println(cents + " pennies");

    }
}
