public class TernaryOperator {
    public static void main(String[] args){
        boolean isAdult;
        int age = 19;

        // If-Else Statement
        if(age >= 18){
            isAdult = true;
        }else{
            isAdult = false;
        }


        // Ternary Operator
        isAdult = age > 17 ? true : false;

        System.out.println("Is Adult? " + isAdult);

    }
}
