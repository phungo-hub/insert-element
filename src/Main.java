import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 5, 99, 22, 13, 15};
        int[] newArray = new int[array.length+1];
        int inputIndex = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input X");
        int input = scanner.nextInt();
        do {
            System.out.println("Input X index");
            inputIndex = scanner.nextInt();
            if (inputIndex <= -1 || inputIndex >= array.length - 1) {
                System.out.println("Please re-input X index");
            }
        } while (inputIndex <= -1 || inputIndex >= array.length - 1);


        for (int i = 0; i < inputIndex; i++) {
            newArray[i] = array[i];
        }
        for (int i = inputIndex; i < array.length + 1; i++) {
            if (i == inputIndex) {
                newArray[inputIndex] = input;
            } else {
                newArray[i] = array[i-1];
            }
        }
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + " ");
        }
    }
}