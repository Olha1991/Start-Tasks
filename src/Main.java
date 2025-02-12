public class Main {
    public static void main(String[] args) {

        //Task 1
        //Use a for loop to print all integers from 1 to 10 to the console.
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 2
        //Use a for loop to print all integers between 10 and 1 to the console.
        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 3
        //Print all even numbers from 0 to 17 to the console.
        System.out.println("Task 3");
        for (int i = 0; i <= 17; i++){
            if(i % 2 == 0){
            System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 4
        //Print to the console all numbers from 10 to -10 from the largest number to the smallest.
        System.out.println("Task 4");
        for (int i = -10; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 5
        //Write a program that outputs to the console all leap years from 1904 to 2096. The result should be output to
        //the console in the format: "... year is a leap year."
        System.out.println("Task 5");
        for (int year = 1904; year <= 2096; year++){
            if (year % 4 ==0){
            System.out.println(year + " year is a leap year.");
            }
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 6
        //Write a program that prints a sequence of numbers to the console:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 7
        //Write a program that prints a sequence of numbers to the console:
        //1 2 4 8 16 32 64 128 256 512
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i *= 2 ){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 8
        //Calculate your annual savings amount using a for loop if you put $2,300 "in the jar" every month.
        //Print your savings amount for each month to the console in the format: "Month ..., savings amount ... dollars".
        System.out.println("Task 8");
        int monthlySavings1 = 2300;
        int months1 = 12;
        int total1 = 0;
        for (int  i = 1; i <= months1; i++){
            total1 = total1 + monthlySavings1;
            System.out.println("Month " + i +" savings amount " + total1 + " dollars");
        }
        System.out.println("Total annual savings " + total1 + " dollars");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 9
        //Rewrite the solution to the problem above, assuming that you will put money aside not "in the jar", but in
        // the bank at interest - 12% per annum. Output the amount of savings for each month to the console in the format:
        // "Month ..., the amount of savings is ... dollars."
        System.out.println("Task 9");
        int monthlySavings = 2300;
        int months = 12;
        int total = 0;
        for (int  i = 1; i <= months; i++){
            total = total + total/100;
            total = total + monthlySavings;
            System.out.println("Month " + i +" savings amount " + total + " dollars.");
        }
        System.out.println("Total annual savings " + total + " dollars.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 10
        //Write a program that prints the 2-times table to the console:
        //2*1=2
        //2*2=4
        //2*3=6
        //2*4=8
        //2*5=10
        //2*6=12
        //2*7=14
        //2*8=16
        //2*9=18
        //2*10=20
        System.out.println("Task 10");
        for(int multiplier = 1; multiplier <=10; multiplier++) {
            System.out.printf("%d * %d = %d%n" , 2, multiplier,2 * multiplier);
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();
    }
}