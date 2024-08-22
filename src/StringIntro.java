//code comments start with //
//comments are notes and explanations for what
//the code does

/*
this is a block comment - don't need // inside the block

Java classes are program files
-class names need to match the file name
-class names need to start with a capital letter
and have no spaces
-all code needs to go in the curly braces of the class
 */


public class StringIntro {

    //this is the main method
    //for now, all code goes in the main method
    public static void main(String [] args) {

        //this is a print statement - like console.log()
        System.out.println("Hello world");

        //"Hello world" is in quotes - it's a string
        //Strings are chars/words/nums/text that can
        //be output or used as data in the program

        //println() adds a line break AFTER what was output
        //print() will not add extra line breaks

        System.out.print("Hi");
        System.out.print("Hi");

        //line break comes AFTER something else
        System.out.println("something else");

        //empty println will insert an extra line break
        System.out.println();

        System.out.println("blah");
    }
}
