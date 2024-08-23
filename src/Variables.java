import java.util.Scanner;
//Scanner is a built-in code library that lets us get input
//Scanner is NOT tested

public class Variables {

    public static void main(String [] args) {

        System.out.println("my name is bob");

        //variables hold date

        //declare the variable first - reference it for the first time
        //define the type - String
        //give the variable a name - username
        //assign the initial value  - "jack"
        String username = "jack";

        System.out.println(username);

        //only declare a variable once
        //after that, to use or change its value, just reference the variable name
        username = "soemthing else";

        //strings can be concatenated (joined) with a +
        System.out.println("now my name is " + username);

        //var names can't have spaces
        //use underscores _ _ _ or use camelCase
        String friendName = "fred";

        friendName = friendName + " isola";
        // single equals (=) is the assignment operator
        //-evaluate what's on the right, then assign to the left
        //-use the old value of friendName ("fred") then add " isola"
        //then save the new value to left (friendName variable)

        System.out.println("my friend's name is " + friendName);

        //to represent numbers, use the int or double data types

        //int means integer - whole numbers, including negatives and zero
        int num = 8;

        System.out.println("num is " + num);

        //num = "steve";
        //you can't mix types and save string values to other data types

        num = num + 4;
        //evaluate what's on the right (old value of num - 8 and 4)
        //then save the result back to the num variable
        System.out.println("+ 4 is " + num);

        // + is add
        // - is subtract
        // * is multiply
        // / is divide
        // % is modulo (mod) - remainder after dividing

        //3 is the remainder after dividing 13 by 5
        //whole number quotient is irrelevant for modulo
        System.out.println("13 % 5 is " + 13 % 5);

        System.out.println("num is "  + num);

        //same as num = num + 3
        num += 3;

        System.out.println("+ 3 is " + num);

        //can also use -=, *=, /=

        //same as num = num + 1 and num +=1
        num++;

        System.out.println("+1 is " + num);

        // num-- works, ** and // do not work

        //IMPORTANT - division with integers will truncate (cut off) any decimals
        //int division will NOT round up
        num = 7/2;
        System.out.println("7 / 2 is " + num);


        //no rounding
        System.out.println("99 / 100 is " + 99/100);

        //the double data type can hold decimal values;
        double numnum = 9.0;
        System.out.println("9.0 / 2 is " + numnum/2);

        numnum = 99.0/100;
        System.out.println(numnum);

        numnum = 99/100.0;
        System.out.println(numnum);

        numnum = 99.0/100.0;
        System.out.println(numnum);

        //right side of the = gets evaluated first
        //since 99 and 100 both do not have decimals, they are seen as ints
        //so int division will evaluate to 0
        //THEN we save it to the left and since numnun is a double, .0 is added to 0
        numnum = 99/100;
        System.out.println(numnum);

        //to get a decimal in division, at least one of the operands needs to be a
        //a double or have a decimal in place

        //ints can be assigned to double variables and a .0 will be added
        numnum = 3;
        System.out.println("numnum is " + numnum);

        //can't save a double value to an int var bc the decimal information is
        //more than an int can handle bc it can only hold whole numbers
        //int number = 3.9;

        //cast (convert) a double to an int, any decimals are truncated, not rounded
        int number = (int)(3.9);
        System.out.println("number is " + number);

        //declare a Scanner object called input to use to get
        //keyboard input from the user
        Scanner input = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = input.nextLine();
        //this will pause the program and wait for the user to enter
        //an input before continuing to run

        System.out.println("hi " + name);

        System.out.println("enter a whole number");
        int uNum = input.nextInt();
        //if the input gets treated as a string, add parentheses around the math
        System.out.println(uNum + " + 5 is " + (uNum + 5));

        System.out.println("enter a decimal number");
        double uDouble = input.nextDouble();
        System.out.println(uDouble + " / 7 is "  + (uDouble/7));

    }
}
