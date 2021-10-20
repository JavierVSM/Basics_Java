import java.util.ArrayList;

public class BasicJava {   
    public static void numbersfrom1to255() {
        System.out.println("Write a method that prints all the numbers from 1 to 255");
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
            }
    }

    public static void oddfrom1to255() {
        System.out.println("============================================================");
        System.out.println("Write a method that prints all the odd numbers from 1 to 255");
        for (int i = 1; i <= 255; i=i+2){
            System.out.println(i);
            }
    }

    public static void sigma255() {
        System.out.println("============================================================");
        System.out.println("Sigma of 255 AKA Sum to 255");
        int ourInt;
        int rlt;
        rlt = 0;
        for (int i = 1; i <= 255; i++){
            rlt = rlt += i;
            }
        System.out.println(rlt);
        //return rlt;  
    }

    public static void loop(int numbers[]) {
        System.out.println("============================================================");
        System.out.println("Iterating through an array");
        for (int item : numbers) {
            System.out.println(item);
        }
    }

    public static void max(int nums[]) {
        System.out.println("============================================================");
        System.out.println("Takes any array and prints the maximum value in the array.");
        int[] numbers = nums;
        int base;
        base= numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(base < numbers [i]){
                base = numbers [i];
                }
            }
        System.out.println(base);
    }

    public static void oddArray() {
        System.out.println("============================================================");
        System.out.println("Create an array that contains all the odd numbers between 1 to 255.");
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i=i+2){
            myArray.add(i);
            }
        System.out.println(myArray);
    }

    public static void main(String[] args) {
        numbersfrom1to255();
        oddfrom1to255();
        sigma255();
        int[] numbers = {1,3,5,7,9,13};
        loop(numbers);
        int nums[]= {19,3,5,-7,90,13};
        max(nums);
        oddArray();
        System.out.println("End of the process");
    }
}