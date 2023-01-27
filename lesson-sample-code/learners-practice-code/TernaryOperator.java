public class TernaryOperator {
    public static void main(String[] args){
        // Convert the follow if-else statement to ternary

        String membershipType = "MEMBER"; // MEMBER or VIP
        int noOfVisits = 10;

        if(noOfVisits > 20){
            membershipType = "VIP";
        }

        // Add code here

        System.out.println("Membership Type " + membershipType);
    }
}
