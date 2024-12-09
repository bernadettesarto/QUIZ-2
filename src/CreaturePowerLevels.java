import java.util.Scanner;

public class CreaturePowerLevels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] powerLevels = new int[10];

        // Step 1: Input power levels
        System.out.println("Enter the power levels of 10 creatures:");
        for (int i = 0; i < powerLevels.length; i++) {
            System.out.print("Power level " + (i + 1) + ": ");
            powerLevels[i] = scanner.nextInt();
        }

        // Step 2: Bubble Sort (Ascending Order)
        int[] bubbleSorted = powerLevels.clone();
        bubbleSort(bubbleSorted);
        System.out.println("\nPower levels sorted in ascending order (Bubble Sort):");
        displayArray(bubbleSorted);

        // Step 3: Selection Sort (Descending Order)
        int[] selectionSorted = powerLevels.clone();
        selectionSort(selectionSorted);
        System.out.println("\nPower levels sorted in descending order (Selection Sort):");
        displayArray(selectionSorted);

        // Step 4: Calculate and display analysis
        System.out.println("\nAnalysis:");
        calculateAndDisplayAnalysis(powerLevels);
    }

    // Bubble Sort Algorithm (Ascending Order)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Algorithm (Descending Order)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i; // Index of the maximum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Swap arr[maxIdx] with arr[i]
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Display array elements
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Calculate and display analysis
    public static void calculateAndDisplayAnalysis(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            // Check if the number is even or odd
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }

            // Update min and max
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Display results
        System.out.println("Sum of even power levels: " + sumEven);
        System.out.println("Sum of odd power levels: " + sumOdd);
        System.out.println("Minimum power level: " + min);
        System.out.println("Maximum power level: " + max);
    }
}

