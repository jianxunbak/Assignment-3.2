public class ControlAssignment {
    public static void main(String args[]) {
        // Task 1. Determine if a number is divisible by 3, 5 or both.
        int numToTest = 995;
        boolean isDivisible;
        // Add code here

        if (numToTest % 3 == 0 && numToTest % 5 == 0) {
            System.out.println("This number is divisible buy 3 and 5");
        } else {
            System.out.println("This number is not divisible by 3 and 5");
        }

        /*
         * Task 2. Given a sample budget, determine what to ride given the following
         * conditions:
         * - if budget is greater than 100, ride a taxi
         * - if budget is between 50 to 100, ride train
         * - if budget is between 20 to 49, ride bus
         * - if budget is between 0 to 19, walk
         * 
         * Reference: What is enum? https://www.w3schools.com/java/java_enums.asp
         */
        float budget = 72.7f;
        enum TransportMode {
            TAXI,
            TRAIN,
            BUS,
            WALK
        }
        TransportMode mode = TransportMode.WALK;
        // Add code here

        if (budget > 100) {
            System.out.println("ride a " + TransportMode.TAXI);
        } else if (budget >= 50) {
            System.out.println("ride a " + TransportMode.TRAIN);
        } else if (budget >= 20) {
            System.out.println("ride a " + TransportMode.BUS);
        } else {
            System.out.println(TransportMode.WALK);
        }

        /*
         * Task 3. Use a switch case to determine the zodiac animal given a number from
         * 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
         * 
         * Code Challenge: Delcare and use enum for your zodiac
         * 
         */

        int animalNumber = 7;
        String zodiac = switch (animalNumber) {
            case 1 -> "Rat";
            case 2 -> "Ox";
            case 3 -> "Tiger";
            case 4 -> "Rabbit";
            case 5 -> "Dragon";
            case 6 -> "Snake";
            case 7 -> "Horse";
            case 8 -> "Goat";
            case 9 -> "Monkey";
            case 10 -> "Rooster";
            case 11 -> "Dog";
            case 12 -> "Pig";
            default -> "No such month";
        };
        System.out.println(zodiac);

        // Add code here
    }
}
