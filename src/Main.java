public class Main {
    public static void main(String[] args) {

        //Task 1
        //The bank has a mobile application. Now, when a user visits the site from a phone, they are offered to download
        // the application depending on what operating system they have.
        //Write a program that determines what the client is using (iOS or Android) and displays the appropriate message:
        //For iOS — “Install the iOS version of the application using the link.”
        //For Android — “Install the Android version of the application using the link.”
        //Declare a variable clientOS equal to 0 or 1 (0 — iOS, 1 — Android).
        System.out.println("Task 1");
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Install the iOS version of the application using the link.");
        } else if (clientOS == 1) {
            System.out.println("Install the Android version of the application using the link.");
        } else {
            System.out.println("App not available.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 2
        //Let's complicate the previous task. Now we need to know not only the operating system of the phone, but also
        // the year of its creation.
        //Your task is to write a program that displays the appropriate message to the client when two conditions are met.
        //If the year of release is earlier than 2015, then you need to add information about the lite version to the
        // installation message:
        //For iOS, this will sound like this: "Install the lite version of the iOS application using the link."
        //For Android: "Install the lite version of the Android application using the link."
        //For users of phones released in 2015 and later, you need to display a regular offer to install the application.
        //For the year of phone creation, use the clientDeviceYear variable, in which you need to specify 2015.
        System.out.println("Task 2");
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Install the lite version of the iOS application using the link.");
        } else if (clientOS == 0 && clientDeviceYear > 2015){
            System.out.println("Install the iOS version of the application using the link.");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Install the lite version of the Android application using the link.");
        } else if (clientOS == 1 && clientDeviceYear > 2015){
            System.out.println("Install the Android version of the application using the link.");
        } else {
            System.out.println("App not available.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 3
        //Write a program that determines whether a year is a leap year or not.
        //Name the year variable year, into which the value of the year we are interested in can be substituted.
        // For example, 2021.
        //The program should determine whether the year is a leap year or not, and output the appropriate message:
        // "....  year is a leap year" or "... year is not a leap year".
        //Some additional information: every fourth year is a leap year, but not every hundredth. Also, every four-hundredth
        // year is a leap year. The year must be greater than 1584 (in which the leap year was introduced).
        System.out.println("Task 3");
        int year = 2024;
        if (year < 1584) {
            System.out.println("The year must be greater than 1584.");
        } else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0 )) {
            System.out.println(year + " year is a leap year.");
        } else {
            System.out.println(year + " year is not a leap year.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 4
        //The bank arranges home delivery of cards for customers. To notify the customer when the card will be delivered,
        // you need to know the distance from the office to the delivery address.
        //The delivery rules are as follows:
        //Delivery within 20 km takes 24 hours.
        //Delivery within 20-60 km adds another day of delivery.
        //Delivery within 60-100 km adds another day.
        //No delivery over 100 km.
        //That is, with each subsequent delivery interval, the term increases by 1 day.
        //Write a program that displays the message in the console: "Delivery will take days: " + delivery term.
        //Declare an integer variable deliveryDistance = 95, which contains the distance to the customer.
        System.out.println("Task 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Delivery will take 1 day.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Delivery will take 2 days.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println(" Delivery will take 3 days.");
        } else {
            System.out.println("No delivery over 100 km.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 5
        //Write a program that determines the season of the year based on the month number. For example, month 1 (January)
        // is winter.
        //Use the switch statement to write the program. Use the variable monthNumber = 12 to specify the month number.
        //Write a condition under which the program will not be executed (month number is greater than 12).
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 11:
            case 12:
            case 1:
                System.out.println("It's winter");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("It's spring.");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("It's summer.");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("It's autumn.");
                break;
            default:
                System.out.println("Month number is greater than 12.");
        }
    }
}