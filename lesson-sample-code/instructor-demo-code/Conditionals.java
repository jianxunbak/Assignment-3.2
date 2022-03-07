public class Conditionals {
    public static void main(String args[]){
        //Programs can be used to alter their outputs given different inputs. In order to do this, the program flow is manipulated through the use of conditional statements.

        //Imagine yourself waking up in the morning and checking the time, you would determine what activity you would do depending if it is a weekday or a weekend. The input would be what day it is and the output would be your activity for the day.

        //In Java, there are two main conditional statements: the if-else statement and the switch case statement.

        //If-else statement
        //The if-else statement is used to execute certain blocks of code depending on the condition. 
        //If the condition is satisfied, it would run the block inside the if. 
        //If the condition is not satisfied, it would run block inside the else
        //The syntax of the if-else statement is as follows:
        /*
        if(condition(s)){
            execute this part if the conditions are satisfied
        } else {
            execute this part if the conditions are not satisfied
        }
        */
        int budget = 1000;
        int expense = 90;
        if (expense < budget){
            System.out.println("You are still within budget");
        } else {
            System.out.println("You are overbudget");
        }
        //Try changing the values of budget and expense and see what statement will be printed

        //If you multiple decision points, you can expand the if-else statement by adding an if condition after the else. This is called an if-else chain.
        float grade = 75.1f;
        if(grade >= 80){
            System.out.println("Your rank is A");
        } else if (grade < 80 && grade >= 60){
            System.out.println("Your rank is B");
        } else {
            System.out.println("Your rank is C");
        }

        //The switch case is similar to if-else chain but it is typically used for discrete values. The value is evaluated and a corresponding case is run as needed.
        /*
        The syntax of the switch case statement is as follows:
        switch(value to be evaluated){
            case <target value 1>:
                Do something if value is the target
                break;
            case <target value 2>:
                Do something if value is the target
                break;
            default:
                Do something if value doesn't fall into any target
        }
        */
        String direction = "N";
        switch(direction){
            case "N":
                System.out.println("You have chosen North");
                break;
            case "E":
                System.out.println("You have chosen East");
                break;
            case "W":
                System.out.println("You have chosen West");
                break;
            case "S":
                System.out.println("You have chosen South");
                break;
            default:
                System.out.println("No corresponding direction from input");
        }
    }
}
