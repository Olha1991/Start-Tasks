public class Main {
    public static void main(String[] args) {

        // Task 1
        //Declare variables of type int, byte, short, long, float, double.
        //The variable name can be anything, but if it consists of two or more words, it must comply with the CamelCase rule.
        //Print the value of each variable to the console in the format “Value of variable... with type... equals...”.
        System.out.println("Task 1");
        int a = 10;
        byte b = 11;
        short c = 12;
        long d = 13L;
        float e = 14.0f;
        double f = 15.11;
        System.out.println("Value of variable 'a' with type 'int' = " + a);
        System.out.println("Value of variable 'b' with type 'byte' = " + b);
        System.out.println("Value of variable 'c' with type 'short' = " + c);
        System.out.println("Value of variable 'd' with type 'long' = " + d);
        System.out.println("Value of variable 'e' with type 'float' = " + e);
        System.out.println("Value of variable 'f' with type 'double' = " + f);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        // Task 2
        //Below is a list of different meanings. Initialize variables, use previously learned variable types.
        //Values:
        //27.12
        //987 678 965 549
        //2,786
        //569
        //-159
        //27897
        //67
        System.out.println("Task 2");
        float a1 = 27.12f;
        long b1 = 987678965549L;
        float c1 = 2.786f;
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte g1 = 67;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(g1);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        // Task 3
        //Three school teachers, Teacher 1, Teacher 2, and Teacher 3, teach three classes.
        //Teacher 1 has 23 students, Teacher 2 has 27 students, and Teacher 3 has 30 students.
        //The three teachers bought 480 sheets of paper for all three classes. Calculate how many sheets each student will receive.
        //Print the result of the problem to the console in the following format: "... sheets of paper are intended for each student."
        //Do not use the var type to declare variables.
        System.out.println("Task 3");
        short students1Class = 23;
        short students2Class = 27;
        short students3Class = 30;
        int totalStudents = students1Class + students2Class + students3Class;
        short paperForAllStudents = 480;
        int paperForEachStudents = paperForAllStudents / totalStudents;
        System.out.println("There are " + paperForEachStudents + " sheets of paper per student.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        // Task 4
        //The output of a bottle making machine is 16 bottles in 2 minutes. What is the output of the machine:
        //in 20 minutes,
        //per day,
        //in 3 days,
        //in 1 month?
        //Calculate the output of the machine if it works continuously for the specified period of time.
        //Print the results of the calculation to the console in the following format: "In ... the machine produced ... bottles".
        //Do not use the var type to declare variables.
        System.out.println("Task 4");
        byte bottlesIn2Minutes = 16;
        int bottlesIn1Minutes = bottlesIn2Minutes / 2;
        int bottlesIn20Minutes = bottlesIn1Minutes * 20;
        System.out.println("In 20 minutes the machine produced " + bottlesIn20Minutes + " bottles.");

        int minutesIn1Day = 1440;
        int bottlesIn1Day = bottlesIn1Minutes * minutesIn1Day;
        System.out.println("In 1 day the machine produced " + bottlesIn1Day + " bottles.");

        int minutesIn3Days = minutesIn1Day * 3;
        int bottlesIn3Days = bottlesIn1Minutes * minutesIn3Days;
        System.out.println("In 3 days the machine produced " + bottlesIn3Days + " bottles.");

        int minutesIn1Month31Days = minutesIn1Day * 31;
        int bottlesIn1Month31Days = bottlesIn1Minutes * minutesIn1Month31Days;
        System.out.println("In 1 month (31 days) the machine produced " + bottlesIn1Month31Days + " bottles.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        // Task 5
        //To renovate a school, you will need 120 cans of paint of two colors: white and brown. One classroom will
        // require 2 cans of white and 4 cans of brown paint. How many cans of each paint were purchased?
        //Print the result of the task in the console in the format: "A school with ... classrooms requires ... cans of
        // white paint and ... cans of brown paint."
        //Do not use the var type to declare variables.
        System.out.println("Task 5");
        byte totalCansOfPaintForSchool = 120;
        byte cansOfWhitePaintFor1Class = 2;
        byte cansOfBrownPaintFor1Class = 4;
        int totalCansFor1Class = cansOfWhitePaintFor1Class + cansOfBrownPaintFor1Class;
        int totalClassesInSchool = totalCansOfPaintForSchool / totalCansFor1Class;
        int totalWhitePaint = totalClassesInSchool * cansOfWhitePaintFor1Class;
        int totalBrownPaint = totalClassesInSchool * cansOfBrownPaintFor1Class;
        System.out.println("A school with " + totalClassesInSchool + " classes requires " + totalWhitePaint
                + " cans of white paint and " + totalBrownPaint + " cans of brown paint.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 6
        //Athletes watch their weight and are careful about what and how much they eat.
        //Here is one recipe that an athlete uses for breakfast:
        //Bananas - 5 pieces (1 banana - 80 grams).
        //Milk - 200 ml (100 ml = 105 grams).
        //Ice Cream - 2 briquettes of 100 grams.
        //Raw eggs - 4 eggs (1 egg - 70 grams).
        //Mix everything in a blender - and you're done.
        //Calculate the weight (number of grams) of such a sports breakfast, and then convert it to kilograms.
        //Display the result in grams and kilograms in the console.
        System.out.println("Task 6");
        byte bananas = 5;
        byte eachBananaInGrams = 80;
        int totalGramsIn5Bananas = bananas * eachBananaInGrams;
        short milkFor100ml = 2;
        byte milk100mlInGrams = 105;
        int totalGramsIn200mlOfMilk = milkFor100ml * milk100mlInGrams;
        byte iceCream = 2;
        byte eachIceCreamInGrams = 100;
        int totalGramsIn2IceCreams = iceCream * eachIceCreamInGrams;
        byte eggs = 4;
        byte eachEggsInGrams = 70;
        int totalGramsIn4Eggs = eggs * eachEggsInGrams;
        int totalGramsInProducts = totalGramsIn5Bananas + totalGramsIn200mlOfMilk + totalGramsIn2IceCreams + totalGramsIn4Eggs;
        float kilogramsIn1gram = 0.001f;
        float totalKilogramsInProducts = totalGramsInProducts * kilogramsIn1gram;
        System.out.println("Sports breakfast contains " + totalGramsInProducts + " grams of products or "
                + totalKilogramsInProducts + " kilograms.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        // Task 7
        //The competition rules have been updated and the athlete needs to lose 7 kg to stay in his weight class. The coach
        // has adjusted the diet so that the athlete can lose 250 to 500 grams per day.
        //Calculate how many days it will take to lose weight if the athlete loses 250 grams every day, and how many if
        // he loses 500 grams every day.
        //Calculate how many days on average it may take to achieve the weight loss result.
        //Display the results of all calculations in the console.
        System.out.println("Task 7");
        byte needToLoseWeightKg = 7;
        short grInKg = 1000;
        int needToLoseWeightGrams = needToLoseWeightKg * grInKg;
        short loseWeightInGrams1DayOption1 = 250;
        short loseWeightInGrams1DayOption2 = 500;
        int totalDaysFofLoseWeightOption1 = needToLoseWeightGrams / loseWeightInGrams1DayOption1;
        System.out.println("If an athlete loses weight at a rate of 250 grams per day, it will take him "
                + totalDaysFofLoseWeightOption1 + " days to lose 7 kilograms");
        int totalDaysFofLoseWeightOption2 = needToLoseWeightGrams / loseWeightInGrams1DayOption2;
        System.out.println("If an athlete loses weight at a rate of 500 grams per day, it will take him "
                + totalDaysFofLoseWeightOption2 + " days to lose 7 kilograms");
        int averageNumberOfDays = (totalDaysFofLoseWeightOption1 + totalDaysFofLoseWeightOption2) / 2;
        System.out.println("To lose 7 kilograms, it will take on average " + averageNumberOfDays + " days.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        // Task 8
        //Let's imagine that we work in a large company with several hundred employees. The company has a rule: the longer
        // an employee works in the company, the more valuable he is to the business. Therefore, employees who have worked
        // in the company for more than 3 years receive a salary increase once a year. Every year, the increase is 10% of
        // the current salary.
        //A manager has contacted you with the task of automating the salary increase, as well as making calculations for
        // the following employees:
        //Michael receives 3897 $ per month.
        //Nick receives 4598 $ per month.
        //Christina receives 4265 $  per month.
        //Everyone needs to increase their salary by 10% of their current monthly salary. In addition, the manager asked
        // to calculate the difference between the annual income with the current salary and after the increase.
        //Calculate how much each employee will receive, as well as the difference between the annual income before and
        // after the increase.
        //Display information on each employee in the console. For example: " Michael now earns  ... dollars.His annual
        //income has increased by ... dollars."
        System.out.println("Task 8");
        int salaryPerMonthMichael = 3897;
        int salaryPerMonthNick = 4598;
        int salaryPerMonthChristina = 4265;

        int percent = 10;
        int allPercent = 100;
        int michael10percent = salaryPerMonthMichael * percent / allPercent;
        int nick10percent = salaryPerMonthNick * percent / allPercent;
        int christina10percent = salaryPerMonthChristina * percent / allPercent;

        int newSalaryPerMonthMichael =salaryPerMonthMichael + michael10percent;
        int newSalaryPerMonthNick = salaryPerMonthNick + nick10percent;
        int newSalaryPerMonthChristina = salaryPerMonthChristina + christina10percent;

        byte monthsAYear = 12;
        int annualIncomeBeforeIncreaseMichael = salaryPerMonthMichael * monthsAYear;
        int annualIncomeBeforeIncreaseNick = salaryPerMonthNick * monthsAYear;
        int annualIncomeBeforeIncreaseChristina = salaryPerMonthChristina * monthsAYear;

        int annualIncomeAfterIncreaseMichael = newSalaryPerMonthMichael * monthsAYear;
        int annualIncomeAfterIncreaseNick = newSalaryPerMonthNick * monthsAYear;
        int annualIncomeAfterIncreaseChristina = newSalaryPerMonthChristina * monthsAYear;

        int deferenceBetweenBeforeAndAfterMichael = annualIncomeAfterIncreaseMichael - annualIncomeBeforeIncreaseMichael;
        int deferenceBetweenBeforeAndAfterNick = annualIncomeAfterIncreaseNick - annualIncomeBeforeIncreaseNick;
        int deferenceBetweenBeforeAndAfterChristina = annualIncomeAfterIncreaseChristina - annualIncomeBeforeIncreaseChristina;
        System.out.println("Michael now earns " + newSalaryPerMonthMichael + " dollars. His annual income has increased by "
                + deferenceBetweenBeforeAndAfterMichael +  " dollars.");
        System.out.println("Nick now earns " + newSalaryPerMonthNick + " dollars. His annual income has increased by "
                + deferenceBetweenBeforeAndAfterNick + " dollars.");
        System.out.println("Christina now earns " + newSalaryPerMonthChristina +  " dollars. Her annual income has increased by "
                + deferenceBetweenBeforeAndAfterChristina + " dollars.");
    }
}