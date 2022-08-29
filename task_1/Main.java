package lesson_1.task_1;

public class Main {
    public static void main(String[] args) {
        int[][] mainArray = new int[5][5];
        initRandomArray(mainArray);
        printMinValue(mainArray);
        printMaxValue(mainArray);
        printMeanValue(mainArray);
    }

    public static void printMaxValue(int[][] someArray) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < someArray[i].length; j++) {
                if (someArray[i][j] > maxValue) {
                    maxValue = someArray[i][j];
                }
            }

        }
        System.out.printf("the maximum value in the array: %d\n", maxValue);
    }

    public static void printMinValue(int[][] someArray) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < someArray[i].length; j++) {
                if (someArray[i][j] < minValue) {
                    minValue = someArray[i][j];
                }
            }

        }
        System.out.printf("the minimum value in the array: %d\n", minValue);
    }

    public static void printMeanValue(int[][] someArray) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < someArray[i].length; j++) {
                sum += someArray[i][j];
                count++;
            }
        }
        System.out.printf("the mean value in the array: %f\n", sum / count);
    }


    public static void initRandomArray(int[][] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < someArray[i].length; j++) {
                someArray[i][j] = (int) (Math.random() * 101);
            }
        }

    }

}
