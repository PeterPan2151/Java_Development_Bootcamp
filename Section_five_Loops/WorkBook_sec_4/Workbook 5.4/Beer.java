public class Beer {
    public static void main(String[] args) {
        // See detailed instructions on Learn the Part.
        for (int i = 99; i > 0; i--) {
            sing(i);
        }

    }

    /**
     * Function name: sing
     * 
     * @param i (int)
     * 
     *          Inside the funtion:
     *          1. print:
     *          i bottles of beer on the wall, i bottles of beer!
     *          take on down, pass it around i-1, bottles of beer on the wall!
     */
    public static void sing(int i) {
        System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
        System.out.println("take on down, pass it around " + (i - 1) + ", bottles of beer on the wall!");
    }

}
