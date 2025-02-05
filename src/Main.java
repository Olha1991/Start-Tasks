public class Main {
    public static void main(String[] args) {
        //Task 1
        //You need to assign different values to variables. To solve this problem, use the var variable type.
        //In IDEA, in the new project you created, assign:
        //-to the dog variable the value 8.0;
        //-to the cat variable the value 3.6;
        //-to the paper variable the value 763789.
        //Print the values of each variable to the console.
        System.out.println("Task 1");
        var dog = 8.0;
        System.out.println("dog - " + dog);
        var cat = 3.6;
        System.out.println("cat - " + cat);
        var paper = 763789;
        System.out.println("paper - " + paper);
        System.out.println("------------------------------------------------------------------------------------");

        //Task 2
        //Increase the value of each variable specified in the previous problem by 4. Use the var variable type to solve
        // this problem.
        //Print the new values of the variables to the console.
        System.out.println("Task 2");
        dog = dog +4;
        System.out.println("1 updated 'dog' - " + dog);
        cat = cat +4;
        System.out.println("1 updated 'cat' - " + cat);
        paper = paper +4;
        System.out.println("1 updated 'paper' - " + paper);
        System.out.println("------------------------------------------------------------------------------------");

        //Task 3
        //Now you need to decrease the value of each variable:
        //-dog decrease by 3.5;
        //-cat decrease by 1.6;
        //-paper decrease by 7639.
        //Output the new values of the variables to the console. To solve this problem, use the var variable type.
        System.out.println("Task 3");
        dog = dog - 3.5;
        System.out.println("2 updated 'dog' - " + dog);
        cat = cat - 1.6;
        System.out.println("2 updated 'cat' - " + cat);
        paper = paper - 7639;
        System.out.println("2 updated 'paper' - " + paper);
        System.out.println("------------------------------------------------------------------------------------");

        //Task 4
        //Initialize (assign a value) to the variable friend with the value 19.
        //Increment the variable by 2, then divide the value by 7.
        //After each operation, print the value of the variable to the console. As a result, you should have 3 values
        //of one variable output.
        //To solve this problem, use the var variable type.
        System.out.println("Task 4");
        var friend = 19;
        System.out.println("friend - " + friend);
        friend = friend + 2;
        System.out.println("1 updated meaning 'friend' - " + friend);
        friend = friend / 7;
        System.out.println("2 updated meaning 'friend' - " + friend);
        System.out.println("------------------------------------------------------------------------------------");

        //Task 5
        //Initialize the frog variable with the value 3.5.
        //Increase the variable by 10 and divide by 3.5. Add 4 to the last value of the variable.
        //After each operation, print the value of the variable to the console. As a result, you should have 4 values
        //of one variable output.
        //To solve this problem, use the var variable type.
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println("frog - " + frog);
        frog = frog * 10;
        System.out.println("1 updated 'frog' - " + frog);
        frog = frog / 3.5;
        System.out.println("2 updated 'frog' - " + frog);
        frog = frog + 4;
        System.out.println("3 updated 'frog' - " + frog);
        System.out.println("------------------------------------------------------------------------------------");

        //Task 6
        //In boxing, before each fight, athletes weigh in. This is done to make sure that the boxers are in their weight
        // class and the fight will be fair.
        //The weight of one boxer is 78.2 kg.
        //The weight of the second boxer is 82.7 kg.
        //Calculate and display the total weight of the two fighters.
        //Calculate and display the difference between the weights of the fighters. To solve this problem, use the var
        //variable type.
        System.out.println("Task 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("weightFirstBoxer - " + weightFirstBoxer);
        System.out.println("weightSecondBoxer - " + weightSecondBoxer);
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("totalWeight - " + totalWeight);
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("differenceWeight - " + differenceWeight);
        System.out.println("------------------------------------------------------------------------------------");

        //Task 7
        //Find the remainder of dividing two weights. Use the var variable type to solve this problem.
        System.out.println("Task 7");
        var remainderFromDivisionWeight = weightSecondBoxer % weightFirstBoxer;
        System.out.println("remainder from division - " + remainderFromDivisionWeight);
        System.out.println("------------------------------------------------------------------------------------");

        //Task 8
        //Solve the problem using arithmetic functions.
        //640 hours of work are divided between employees. If each employee devotes 8 hours to work, then how many
        // employees work in the company? Output the result of the problem to the console in the format: "The total number
        // of employees of the company is ... people."
        //Calculate how many hours of work should be divided between employees if the company employs 94 more people.
        //Output the result of the problem to the console in the format: "If the company employs ... people, then a
        // total of ... hours of work can be divided between employees."
        //To solve this problem, use the var variable type.
        System.out.println("Task 8");
        System.out.println("1)");
        var totalHours = 640;
        var hoursOfEachEmployee = 8;
        var totalEmployees = totalHours / hoursOfEachEmployee;
        System.out.println("The total number of employees in the company is " + totalEmployees + " people.");

        System.out.println("2)");
        totalEmployees = totalEmployees + 94;
        totalHours =totalEmployees * hoursOfEachEmployee;
        System.out.println("If the company employs " + totalEmployees + " people, then a total of " + totalHours
                + " hours of work can be divided between employees.");
    }
}