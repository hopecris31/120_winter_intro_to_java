public class Client {

    public static void main(String[] args) {

        // contructing objects in Java:
        // 3 steps:
        // 1. Declare variables
        // 2. Run the constructor
        // 3. Assign what the constructor returns to the variable

        Card myCard;
        myCard = new Card(2, "Hearts");

        Card newCard = new Card(12, "Spades") // does the same thing as above, but in one step
        int theRank = newCard.getRank();
        System.out.print(theRank); // print function

        // make card with new constructor
        Card anotherCard = new Card(10,2);
        System.out.println('another card is'+anotherCard);

        int[] someArray;
        somArray = new int[10]; //empty array of 10 spaces

        String[] someStrings = new String[3] //empty string array with 3 spaces

        int[][] matrix = new int[5][2]; //2D array of ints
        matrix[0][0] = 1;

        //calling a static method, use class name
        System.out.println(Math.abs(-9));
    }
}