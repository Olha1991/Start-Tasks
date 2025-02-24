public class Main {
    public static void main(String[] args) {

        //Task 1
        //Imagine that you work in a small company. Employee data is stored in an unstructured format. The accounting
        //department has asked you to write a program that can work with employee names.
        //Write three lines:
        //With the name firstName — to store the first name.
        //With the name lastName — to store the last name.
        //With the name fullName — to store the employee's full name in the format "First Name Last Name".
        //Print to the console the phrase: "The employee's full name is ...".
        //Use Mary Smith as the data for the task.
        System.out.println("Task 1");
        String firstName = "Mary";
        String lastName = "Smith";
        String fullName = firstName + " " + lastName;
        System.out.println("The employee's full name is " + fullName);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 2
        //For the monthly report and documentation, the accounting department needs the full names of employees written
        // entirely in capital letters (uppercase).
        //Write a program that will change the spelling of the employee's full name from Mary Smith to all capital letters.
        //Use the string fullName as the string with the original data.
        //Output the program result to the console in the following format: “Employee’s full name for filling out the report — …”.
        System.out.println("Task 2");
        System.out.println("Employee’s full name for filling out the report — " + fullName.toUpperCase());
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 3
        //The system we work in does not accept the "_" symbol. Write a program that will replace the character "-" with the character "-".
        //Use the fullName string and the data in it as the initial data - "Anna_Marie Smith".
        //Output the program's output to the console in the format: "Employee's full name data - ...".
        System.out.println("Task 3");
        String fullName1 = "Anna_Marie Smith";
        fullName1 = fullName1.replace("_", "-");
        System.out.println("Employee's full name data - " + fullName1);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();
    }
}