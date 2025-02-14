import java.time.Year;

public class Main {
    public static void main(String[] args) {

        //Task 1
        //Continue working with the code you wrote in the previous lesson - in the problems with savings.
        //Using a while loop, calculate how many months it will take to save $450,000, given that we start with $0
        // and are willing to save $4,000.
        //The program output should be printed to the console with the number of months needed to save this amount.
        // The format of the message is: "Month ..., the amount saved is ... dollars."
        System.out.println("Task 1");
        int monthlySavings = 4000;
        int total = 0;
        int i = 0;
        while (total < 450000) {
            i++;
            total = total + monthlySavings;
            System.out.println("Month " + i + " the amount saved is " + total + " dollars.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 2
        //Print the numbers from 1 to 10 on one line separated by spaces using the while loop.
        //On the next line, print the numbers in reverse order from 10 to 1 using the for loop.
        //You can use either one common variable for both loops or your own in each loop.
        //Don't forget to make a new line between the two loops.
        //The program output should be as follows:
        //1 2 3 4 5 6 7 8 9 10
        //10 9 8 7 6 5 4 3 2 1
        System.out.println("Task 2");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 3
        //Country Y has a population of 12 million people.
        //The birth rate is 17 people per 1000, the death rate is 8 people. Calculate what the population will be
        // in 10 years if the birth and death rates are constant.
        //In the console, output the result of the operation for each year in the format: "Year ..., the population is ...".
        System.out.println("Task 3");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 4
        //Vasily decided to put money into a savings account, where 7% is added to the amount of his deposit every month.
        // The initial deposit amount is 15 thousand dollars.
        //Calculate and display in the console how many months Vasily will need to save to collect the amount of 12 million dollars,
        // provided that the bank's savings percentage does not change, but is always 7%.
        //Display in the console the result of the program's work indicating the amount of savings for each month.
        System.out.println("Task 4");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 5
        //Modify the program so that not all months in a row are displayed on the console, but only every sixth.
        //Accumulations for the 6th, 12th, 18th, 24th and subsequent months should be visible.
        System.out.println("Task 5");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 6
        //Vasily has decided that he will save money for the next 9 years. He wants to know what his savings amount
        // will be every six months for these 9 years.
        //The initial amount is still the same - 15 thousand dollars, the bank interest is 7% monthly.
        //Write a program that will output the savings amount every six months for 9 years.
        System.out.println("Task 6");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 7
        //In the company, Friday is the reporting day.
        //You need to write a program that counts the days of the month by dates, determines which day is Friday, and
        // displays a message reminding you to prepare a weekly report.
        //Create a variable of type int that will store the number that falls on the first Friday of the month (a number from 1 to 7).
        //Display a message of the following type on every Friday of the month (including the received one): “Today is
        //Friday, ... date. You need to prepare a report.”
        //There are 31 days in our month. As a result, you should have 4-5 messages with reminders on different dates.
        System.out.println("Task 7");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 8
        //We need to write an astronomy application that counts when a comet flies over the Earth.
        //It is known that the comet flies every 79th year, starting from the year 0.
        //In the console, we need to display all the years in the last 200 years when the comet appeared, as well as
        // the next year of its appearance (the next 100 years).
        //To calculate the period, you can create two additional variables that contain the year 200 years before the
        // current one (from the previously created variable) as the beginning and 100 years later as the end of the calculation period.
        //As a result of solving the problem, the console should display the following result:
        //1896
        //1975
        //2054
        System.out.println("Task 8");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();
    }
}