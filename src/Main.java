import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int [] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }
        System.out.println();
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if(weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Arrays are the same!");
        }else {
            System.out.println("Arrays are different!");
        }
        for (int i = 0; i < weightsCopy.length; i++) {
            System.out.print(weightsCopy[i] + " ");
        }
        int maxWeight = -1;
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights [i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }

        //Task 1
        //The accountants asked you to calculate the sum of all payments for the month.
        //Create an array of five integer elements and assign a value to each element.
        //Write a program that will solve this problem and output the result to the console in the format: "The sum
        // of expenses for the month was ... dollars."
        System.out.println("Task 1");
        int [] amountByDays = {968, 745, 657, 412, 956};
        int sum = 0;
        for (int i = 0; i < amountByDays.length; i++) {
            sum = sum + amountByDays[i];
        }
        System.out.println("The sum of expenses for the month was " + sum + " dollars.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 2
        //The accounting department also asked you to find the minimum and maximum expenses for the week.
        //Create an array of five integer elements and assign a value to each element.
        //Write a program that will solve this problem and output the result to the console in the format: "The minimum
        // amount of expenses for the week was ... dollars. The maximum amount of expenses for the week was ... dollars."
        System.out.println("Task 2");
        int[] weeklyExpenses = {236, 125, 589, 26, 745, 695, 365};
        int maxExpenses = -1;
        int minExpenses = weeklyExpenses[0];
        for (int i = 0; i < weeklyExpenses.length; i++) {
            if (weeklyExpenses[i] > maxExpenses) {
                maxExpenses = weeklyExpenses[i];
            }
            if (weeklyExpenses[i] < minExpenses){
                minExpenses = weeklyExpenses[i];
            }
        }
        System.out.println("The minimum amount of expenses for the week was " + minExpenses + " dollars. The maximum amount of expenses for the week was " + maxExpenses + " dollars.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 3
        //Now the accounting department wants to understand how much the company spends on average each week.
        //Create an array of five integer elements and assign a value to each element.
        //Write a program that will calculate the average monthly expenses (i.e. the sum of all monthly expenses divided
        // by the number of weeks) and output the result to the console in the following format: "The average monthly
        // expenses were ... dollars."
        //It is important to remember: the calculation of the average value may have a remainder, i.e. it may not be an
        // integer, but a fractional number.
        System.out.println("Task 3");
        int [] expenses = new int [5];
        expenses[0] = 2560;
        expenses[1] = 7895;
        expenses[2] = 4158;
        expenses[3] = 5269;
        expenses[4] = 4896;
        int sum5weeks = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum5weeks = sum5weeks + expenses[i];
        }
        float average = (float) sum5weeks / 5;
        System.out.println("The average monthly expenses were " + average + " dollars.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 4
        //There is a bug in the accounting book. Something went wrong: the last names and first names of employees began
        // to be displayed in the opposite direction. That is, instead of "Mary Smith" we have "htimS yraM ". The data
        // with the names of employees is stored as an array of characters char[ ].
        //Write code that will reverse the contents of the array and then output its contents. As data for the array, use:
        //char[] reverseFullName = { 'h', 't', 'i', 'm', 'S', ' ', 'y', 'r', 'a', 'M'};
        //As a result, the console should display: Mary Smith.
        //Important: do not use additional arrays to solve this problem. It is necessary to correctly iterate over the
        // array and change its contents to establish the correct order.
        System.out.println("Task 4");
        char[] reverseFullName = { 'h', 't', 'i', 'm', 'S', ' ', 'y', 'r', 'a', 'M'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}