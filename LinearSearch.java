import java.lang.reflect.Array;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9,11,15,17,20,45};
        System.out.println("Enter the number to search for");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        int arrayindex=-1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==input){
                arrayindex=i+1;
            }
        }
        if(arrayindex!=-1){
        System.out.println("The number you searched for is in "+ arrayindex + "th postion");
    }else{
            System.out.println("The entered number does not exist in the array");
        }

    }
}
