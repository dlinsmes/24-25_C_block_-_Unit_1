public class RandomNumbers {
    public static void main(String [] args) {

        //Math.random() produces a random double
        //between 0 and 1, exclusive of 1
        //[0, 1) -- always 0.something
        double r = Math.random();
        System.out.println(r);

        //expand the range of generated numbers [0, 5)
        //the highest it can be is 4.999999...
        r = Math.random() * 5;
        System.out.println(r);

        //random int [0, 5) same as [0, 4]
        int rand = (int)(Math.random() * 5);
        System.out.println(rand);

        //this produces 0 every time
        // without parentheses, only the term
        //directly to the right of (int) gets cast
        //and since Math.random() produces 0.something,
        //this will always get cast to 0
        //0 * anything is still 0
        rand = (int) Math.random() * 5;
        System.out.println(rand);

        //[1, 5]
        //add 1 to offset the whole range
        rand = (int)(Math.random() * 5) + 1;
        System.out.println(rand);

        //die roll [1,6]
        //multiplier is how many different ints you're producing
        //add-on is the starting value
        rand = (int)(Math.random() * 6) + 1;
        System.out.println(rand);

        //[10, 20]
        rand = (int)(Math.random() * 11) + 10 ;
        System.out.println(rand);

        //[3, 10]
        rand = (int)(Math.random() * 8) + 3;
        System.out.println(rand);

        //general formula for [min, max]
        //(int)(Math.random() * (max-min+1) ) + min

        //[51, 97]
        //sub in 51 for min, 97 for max
        rand = (int)(Math.random() * (97-51 + 1)) + 51;

    }
}
