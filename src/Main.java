public class Main {
    public static void main(String[] args) {

        //Task 1
        //Using a conditional operator, write a program that prints to the console:
        //a message that the person is 18 or older;
        //a message that the person is not yet of legal age, you need to wait a little.
        //When each condition is met, the program should print to the console a message in the format: "If the person is ...,
        // then (output depending on the result) he is an adult / he is not yet of legal age, you need to wait a little."
        System.out.println("Task 1");
        int age = 17;
        if (age >= 18){
            System.out.println("If the person is "+ age + ", then he is an adult.");
        } else {
            System.out.println("If the person is "+ age + ", then he is not yet of legal age, you need to wait a little");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 2
        //A person dresses depending on the air temperature. Write a program that displays the message:
        //"It's cold outside, you need to put on a hat" - if the temperature is below 5 degrees.
        //"It's warm today, you can go without a hat" - if the air temperature is above 5 degrees.
        //When each condition is met, display on the console: "It's ... degrees outside, (output depending on the result)
        // you need to put on a hat/you can go without a hat".
        System.out.println("Task 2");
        int airTemperature = -5;
        if (airTemperature <= 5){
            System.out.println("It's " + airTemperature + " degrees outside, you need to put on a hat.");
        } else {
            System.out.println("It's " + airTemperature + " degrees outside, you can go without a hat.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task3
        //A driver may be issued a speeding ticket. Write a program that informs the driver that:
        //the speed is exceeded if it is more than 60 km/h;
        //the speed is not exceeded if it is less than 60 km/h.
        //When each condition is met, the program should output the following message: "If the speed is ...,
        // then (output depending on the result) you will have to pay a fine / you can drive safely."
        System.out.println("Task 3");
        int speed = 60;
        if (speed <= 60) {
            System.out.println("If the speed is" + speed + " then, you can drive safely.");
        } else {
            System.out.println("If the speed is" + speed + " then, you'll have to pay a fine.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 4
        //Write a program that will help determine which institution a person should be sent to depending on their age:
        //If a person is between 2 and 6 years old, then they need to go to kindergarten.
        //If a person is between 7 and 17 years old, then they need to go to school.
        //If a person is greater than or equal to 18 but less than or equal to 24, then their place is at university.
        //And if a person is greater than 24, then it's time for them to go to work.
        //When each condition is met, the program should output a message to the console in the following format:
        // "If a person's age is ..., then they need to go to ... (add the necessary values depending on age)."
        System.out.println("Task 4");
        int agePerson = 17;
        if (2 <= agePerson && agePerson <= 6) {
            System.out.println("If a person's age is " + agePerson + " then they need to go to kindergarten.");
        }
        if (7 <= agePerson && agePerson <= 17) {
            System.out.println("If a person's age is " + agePerson + " then they need to go to school.");
        }
        if (18 <= agePerson && agePerson <= 24) {
            System.out.println("If a person's age is " + agePerson + " then they need to go to university.");
        }
        if (24 < agePerson){
            System.out.println("If a person's age is " + agePerson + " then they need to go to work.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 5
        //As a rule, there are age restrictions on rides for children:
        //If a child is under 5 years old, he can't ride the ride.
        //If a child is over 5 years old but under 14 years old, he can ride only if accompanied by an adult. If there
        // is no adult, he can't ride.
        //If a child is over 14 years old, he can ride without an adult.
        //Write a program that prints a message to the console in the following format: "If the child is ...,
        // then he ... (depending on the age, add what is necessary: cannot ride the ride, can with / without an adult)".
        System.out.println("Task 5");
        int ageChild = 6;
        if (ageChild < 5) {
            System.out.println("If the child is " + ageChild + " then he can't ride the ride.");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("If the child is " + ageChild + " then he can ride only if accompanied by an adult. If" +
                    " there is no adult, he can't ride.");
        }
        if (ageChild >= 14) {
            System.out.println("If the child is " + ageChild + " then he can ride without an adult.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 6
        //The capacity of one carriage is 102 people. The carriage is designed for 60 seats, all the rest are standing.
        //Using the conditional operator and the else construct, write a program that prints to the console a message
        // about availability of seats in the carriage, a sitting or standing place, or whether the carriage is already completely full.
        System.out.println("Task 6");
        int passengers = 47;
        int capacityOfTheCarriage = 120;
        int seats = 60;
        if (passengers < seats) {
            System.out.println("There are available seats.");
        } else if (passengers > seats && passengers < capacityOfTheCarriage){
            System.out.println("There is available standing room.");
        } else {
            System.out.println("There are no available seats.");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 7
        //Given three numbers:
        //int one;
        //int two;
        //int three
        //Using a conditional statement and the else construct, write a program that calculates which of the three
        // numbers is greater and prints the result to the console.
        System.out.println("Task 7");
        int one = 5;
        int two = 25;
        int three = 27;
        if ( one > two && one > three) {
            System.out.println(" Number one more than all.");
        } else if (two > one && two > three){
            System.out.println(" Number two more than all.");
        } else {
            System.out.println(" Number three more than all.");
        }



    }
}