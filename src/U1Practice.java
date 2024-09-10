import java.util.Scanner;

public class U1Practice {

    //warm up
    //prompt the user to enter dog, cat, or moose
    //write a boolean expression that results in
    //FALSE if the user entered something valid (one of the 3)
    //TRUE if they enter something invalid (not one of the 3)
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter dog, cat, or moose");
        String user = input.nextLine();

        boolean b = !( user.equals("dog") || user.equals("cat") || user.equals("moose"));

        //DeMorgan equivalent:
        b = !user.equals("dog") && !user.equals("cat") && !user.equals("moose");

        System.out.println("you did it wrong: " + b);

        int a = 20;
        int c = 30;
        //swap the values of a and c

        //doesn't work - lose the original value of a
        //a = c;
        //c = a;

        //whichever variable you assign to temp,
        //start with that variable in the following line
        int temp = a;
        a = c;
        c = temp;

        System.out.println("a is " + a +", c is " + c);

        //can start with variable c first:
        temp = c;
        c = a;
        a = temp;

        System.out.println("a is " + a +", c is " + c);

        //order of operations: PEMDAS
        // parentheses
        // no exponent operator in java
        // *, /, % have the same priority, evaluate left to right
        // +, - have the same priority, evaluate left to right

        a = 9 + 7 / 2 - 3 * 3; // 7/2 evaluates as int div --> 3
        //= 9 + 3     - 9
        //= 3
        System.out.println(a);

        //parentheses first
        a = (9 + 7) / 2 - 3 * 3;
        System.out.println(a);


        //a and c are both ints
        a = 10;
        c = 3;

        //double division with int variables

        //int div is evaluated first, then saved to a double
        double d = a/c;
        System.out.println(d);

        //a is cast as a double so this evaluates as double div
        d = (double)a/c;
        System.out.println(d);

        d = a/(double)c;
        System.out.println(d);

        //no worky
        //div in parentheses is int div --> 3, THEN 3 gets cast to 3.0
        d = (double)(a/c);
        System.out.println(d);
    }


}
