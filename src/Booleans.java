import java.util.Scanner;
public class Booleans {
    public static void main(String [] args) {

        //boolean is a data type that stores either
        //true or false
        boolean b = true;
        System.out.println(b);

        b = false;
        System.out.println(b);

        //! is negation - say as "NOT"
        b = !true;
        System.out.println(b);

        //flip the current value
        b = !b;
        System.out.println(b);

        //comparisons: <, >, <=, >= (less than or equal)
        int x = 8;

        //boolean variables can be assigned boolean expressions
        //(what would go in the condition for an if-statement)
        b = x > 3;
        System.out.println(b);

        //can negate expressions
        //-first evaluate the expression as-is, then find
        //the opposite boolean value
        b = !(x > 3) ; // same as x <= 3
        System.out.println(b);


        //single equals = is the assignment operator - set a variable
        //to a value
        //double equals == is used as a comparison to check if
        //the two terms are equivalent

        //right side first - check if x is the same as 8, which
        //evaluates to either true or false
        //THEN assign that true/false to b
        b = x == 8;
        System.out.println(b);

        b = !(x == 8);
        //same as
        b = x != 8;

        //!= checks if the values are NOT the same --> true
        //and if they ARE the same --> false

        //in math:
        // 4 < x <= 10

        //not valid in java
        //b = 4 < x <= 10;


        //AND - && - both expressions must be true for the
        //whole thing to be true
        //-each side of the && must be a valid standalone expression
        b = (4 < x) && (x <= 10);
        System.out.println(b);

        x = 12;
        //only one side of the && is true so the
        //whole expression evaluates to false
        b = (4 < x) && (x <= 10);
        System.out.println(b);

        //OR - || - at least one of the expressions needs to be
        //true for the whole thing to be true
        //check if x is greater than 10 OR it's even
        x = 11;
        b = x > 10 || x % 2 == 0;

        System.out.println(b);

        String word = "apple";
        //for Strings, do NOT use ==, it works inconsistently
        // use .equals(word) - this will always work
        b = word.equals("orange");
        System.out.println(b);

        //the terms can go on either side
        b = "apple".equals(word);
        System.out.println(b);

        //not the right way to negate:
        //b = "orange".!equals("apple");

        b = !("orange".equals("apple"));
        System.out.println(b);

        //want the user to enter "a" or "b"
        //--> evaluate true if they did it correctly, false otherwise
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a or b:");
        String user = input.nextLine();
        b = user.equals("a") || user.equals("b");
        System.out.println(b);

        //DeMorgan's law:
        // !(A OR B) is the same !A AND !B
        // !(A AND B) is the same as !A OR !B

        b = !(x >= 10 || x % 3 == 0);

        //same as
        b = x < 10 && !(x % 3 == 0); //x % 3 != 0










    }
}
