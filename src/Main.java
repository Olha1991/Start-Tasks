import java.time.LocalDate;

public class Main {

    public static void leapYear (int year) {
    if (year < 1584) {
        System.out.println("The year must be greater than 1584");
    } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println(year + " year is a leap year");
    } else {
        System.out.println(year + " year is not a leap year");
    }
}

public static void selectVersion(int client, int deviceYear){
    int currentYear = LocalDate.now().getYear();
    if (client == 0 && deviceYear != currentYear) {
        System.out.println("Install the lite version of the iOS application using the link.");
    } else if (client == 0 && deviceYear == currentYear){
        System.out.println("Install the iOS version of the application using the link.");
    } else if (client == 1 && deviceYear != currentYear){
        System.out.println("Install the lite version of the Android application using the link.");
    } else if (client == 1 && deviceYear == currentYear){
        System.out.println("Install the Android version of the application using the link.");
    } else {
        System.out.println("App not available.");
    }
}

public static void numberOfDeliveryDays(int distance ){
    if (distance <= 20) {
        System.out.println("Delivery will take 1 day.");
    } else if (distance > 20 && distance <= 60){
        System.out.println("Delivery will take 2 days.");
    } else if (distance > 60 && distance <= 100){
        System.out.println(" Delivery will take 3 days.");
    } else {
        System.out.println("No delivery over 100 km.");
    }
}
    public static void main(String[] args) {

        //Task 1
        //Implement a method that receives a year as a parameter, checks whether it is a leap year, and prints the
        //result to the console.
        //Wrap the check in a method and use the year that comes as a parameter.
        //Print the program's result to the console. If the year is a leap year, then print the message: "... year is a
        // leap year." If the year is not a leap year, then: "... year is not a leap year."
        System.out.println("Task 1");
        leapYear(2025);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task2
        //Write a method that takes two parameters: the operating system type (0 — iOS, 1 — Android) and the year the
        // device was manufactured.
        //If the device is older than the current year, offer it to install a light version.
        //The current year can be obtained in this way:
        //int currentYear = LocalDate.now().getYear();
        //Or you can set the value manually — enter a numeric value into the variable.
        //As a result, the program should display a message in the console indicating which version of the application
        // (regular or light) and for which OS (Android or iOS) the user should install.
        System.out.println("Task 2");
        selectVersion(0, 2021);
        selectVersion(1, 2025);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 3
        //Let's get back to the problem of calculating the days of delivery of a bank card.
        //Text of the previous task
        //A bank organizes home delivery of cards to customers. To notify the customer when the card will be delivered, you need to know the distance from the office to the delivery address.
        //The delivery rules are as follows:
        //Delivery within 20 km takes 24 hours.
        //Delivery within 20 km to 60 km adds another day of delivery.
        //Delivery within 60 km to 100 km adds another day.
        //There is no delivery over 100 km.
        //That is, with each subsequent delivery interval, the period increases by 1 day.
        //Write a program that displays the message in the console: "Delivery will take days: ... " + delivery period.
        //Declare an integer variable deliveryDistance = 95, which contains the distance to the customer.
        //Your task is to finalize the code, namely, write a method that takes the distance as input and returns the
        // total number of days of delivery.
        System.out.println("Task 3");
        numberOfDeliveryDays(20);

    }
}