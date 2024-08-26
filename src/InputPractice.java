import java.util.Scanner;

public class InputPractice {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = input.nextLine();

        System.out.println("how old are you in years?");
        int years = input.nextInt();

        //years to decades and remainder years

        //int division is useful here bc we don't want
        //to round up - we want the number of complete decades
        int decades = years/10;

        //remaining years - use modulo to produce the remainder
        //after division
        int remaining = years%10;

        System.out.println("hi " + name + ", you are " + decades
        + " decades and " + remaining + " years old");

        //years to days + leap year days

        int days = 365 * years;

        //calculate how many sets of 4, which is the number of extra days
        //to add
        int extraDays = years / 4;

        System.out.println("this is the same as " + days + " days and "
        + extraDays + " leap year days");

        //weird Scanner behavior - when switching from number input
        //to String input, the following String input will get skipped

        //workaround:
        //add an extra nextLine() and allow the program to skip this one
        //so then it runs the one you intend afterward
        input.nextLine();

        //prompt for favorite color and favorite food, then output both
        System.out.println("favorite color?");
        String color = input.nextLine();
        System.out.println("favorite food?");
        String food = input.nextLine();

        System.out.println("your favorite color is " + color +
                " and your favorite food is " + food);

    }
}
