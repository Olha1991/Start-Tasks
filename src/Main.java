import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        //Declare three arrays:
        //-An integer array filled with three digits — 1, 2, and 3 — using the keyword new.
        //-An array that can store three fractional numbers — 1.57, 7.654, 9.986. Fill the array with values at once.
        //-A random array. Determine the type and size of the data yourself. Choose the method of creating the array
        // yourself: using a keyword or immediately filled with elements.
        System.out.println("Task 1");
        int [] array1= new int [3];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;
        double [] array2 = {1.57, 7.654, 9.986};
        long [] array3 = {8996, 7895, 61125, 7964223};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 2
        //Print the elements of each array on a separate line in order, separated by commas. There is no need to put
        // a comma at the end of the line.
        System.out.println("Task 2");
        //Array 1
        for(int i = 0; i < array1.length; i++){
            if(i < array1.length - 1){
                System.out.print(array1[i] + ", ");
            }else {
                System.out.println(array1[i]);
            }
        }
        //Array 2
        for(int i = 0; i < array2.length; i++){
            if (i < array2.length -1){
                System.out.print(array2[i] + ", ");
            }else{
                System.out.println(array2[i]);
            }
        }
        //Array 3
        for(int i = 0; i < array3.length; i++) {
            if (i < array3.length -1){
                System.out.print(array3[i] + ", ");
            }else{
                System.out.println(array3[i]);
            }
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 3
        //Print the elements of each array in reverse order on a separate line, separated by commas. There is no need
        // to put a comma at the end of the line.
        //If in task 2 you got the following result in the console:
        //1, 2, 3
        //1.57, 7.654, 9.986
        //// Arbitrary elements of the third array
        //then in this task the result should be:
        //3, 2, 1
        //9.986, 7.654, 1.57
        //// Arbitrary elements of the third array in reverse order.
        System.out.println("Task 3");
        for(int i = array1.length -1; i >= 0; i--){
                System.out.print(array1[i]);
                if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = array2.length -1; i >= 0; i--){
            System.out.print(array2[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = array3.length -1; i >= 0; i--){
            System.out.print(array3[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println();

        //Task 4
        //Loop through the first integer array and make all odd numbers in it even (add 1).
        //Important: the code should work with any integer array, so use loops to solve the problem.
        //Print the result of the conversion to the console.
        System.out.println("Task 4");
        for (int i = 0; i < array1.length; i++){
            if( array1[i] % 2 != 0){
                array1[i] = array1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}