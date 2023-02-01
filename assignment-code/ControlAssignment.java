public class ControlAssignment {
    public static void main (String args[]){
        // Task 1. Determine if a number is divisible by 3, 5 or both.
        int numToTest = 995;
        boolean isDivisible;
        // Add code here

        /* 
            Task 2. Given a sample budget, determine what to ride given the following conditions:
            - if budget is greater than 100, ride a taxi
            - if budget is between 50 to 100, ride train
            - if budget is between 20 to 49, ride bus
            - if budget is between 0 to 19, walk

            Reference: What is enum? https://www.w3schools.com/java/java_enums.asp
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

        /* 
         * Task 3. Use a switch case to determine the zodiac animal given a number from 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
         * 
         * Code Challenge: Delcare and use enum for your zodiac
         * 
         */        

        int animalNumber = 7;

        // Add code here
    }
}
