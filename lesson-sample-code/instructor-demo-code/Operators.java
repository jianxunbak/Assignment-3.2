class Operators{
    public static void main(String args[]){
        //4 types of operators:
        /*
            1. arithmetic
            2. assignment
            3. comparison
            4. logical
        */
        //Arithmetic operators are operators that deal with numbers
        int num1 = 1003;
        int num2 = 88;
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2; 
        int rem = num1 % num2; 
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + diff);
        System.out.println("The product is " + prod);
        System.out.println("The quotient is " + quot);
        System.out.println("The remainder is " + rem);

        //Assignment operators are operators that deal with assigning values to variables
        int a = 7;
        int b = a; //Assigns the value of a to b
        System.out.println("The value of b is " + b);
        b += 3; //Adds 3 then assigns the result to b (same as b = b + 3)
        System.out.println("The value of b after the operation is " + b);
        int c = 17;
        c -= 6; //Subtracts 3 then assigns the result to c (same as c = c - 6)
        System.out.println("The value of c after the operation is " + c);
        int d = 12;
        d *= 15; //Multiplies 15 then assigns the result to d (same as d = d * 15);
        System.out.println("The value of d after the operation is " + d);
        int e = 9996;
        e /= 3; //Divides by 3 then assigns the result to e (same as e = e / 3);
        System.out.println("The value of e after the operation is " + e);
        int f = 121239;
        f %= 8; //Gets the remainder when divided by 8 then assigns the result to f (same as f = f % 8);
        System.out.println("The value of f after the operation is " + f);

        //Relational operators are operators that check the relationship between two values. The result is always boolean values.
        int numA = 199;
        int numB = 293;
        //Equality operator checks if the values are equal
        System.out.println(numA == numB);
        //Inequality operator checks if the values are not equal
        System.out.println(numA != numB);
        //Greater than, less than, Greater than or equal to, less than or equal to
        System.out.println(numA > numB);
        System.out.println(numA < numB);

        //Logical operators are operators that compare boolean values. The result is always a boolean
        //Logical AND returns true if ALL values are true
        boolean value1 = true;
        boolean value2 = true;
        boolean value3 = false;
        boolean value4 = false;
        System.out.println(value1 && value2);
        System.out.println(value1 && value3);
        //Logical OR returns true if AT LEAST ONE value is true
        System.out.println(value2 || value3);
        System.out.println(value3 || value4);
        //Logical NOT inverts the value of the variable
        System.out.println(!value1);
        System.out.println(!value3);
    }
}