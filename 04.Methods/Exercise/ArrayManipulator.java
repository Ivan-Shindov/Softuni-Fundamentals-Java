import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] numbersArray = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbersArray[i] = Integer.parseInt(input[i]);
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");
            String commandType = tokens[0];

            if (commandType.equals("exchange")) {
                int index = Integer.parseInt(tokens[1]);
                if (isInRange(numbersArray, index)) {
                    rotateArray(numbersArray, index);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (commandType.equals("max")) {
                int index = 0;
                if (tokens[1].equals("even")) {
                    index = findMaxEven(numbersArray);
                } else if (tokens[1].equals("odd")) {
                    index = findMaxOdd(numbersArray);
                }
                if (index == -1) {
                    System.out.println("No matches");
                } else {
                    System.out.println(index);
                }

            } else if (commandType.equals("min")) {
                int index = 0;
                if (tokens[1].equals("even")) {
                    index = findMinEven(numbersArray);
                } else if (tokens[1].equals("odd")) {
                    index = findMinOdd(numbersArray);
                }
                if (index == -1) {
                    System.out.println("No matches");
                } else {
                    System.out.println(index);
                }


            } else if (commandType.equals("first")) {
                int count = Integer.parseInt(tokens[1]);
                if (count > numbersArray.length) {
                    System.out.println("Invalid count");
                } else {
                    if (tokens[2].equals("even")) {
                        int[] result = getFirstEvenElements(numbersArray,count);
                        printArray(result);
                    } else if (tokens[2].equals("odd")) {
                        int[] result = getFirstOddElements(numbersArray,count);
                        printArray(result);
                    }
                }

            } else if (commandType.equals("last")) {
                int count = Integer.parseInt(tokens[1]);
                if (count > numbersArray.length) {
                    System.out.println("Invalid count");
                } else {
                    if (tokens[2].equals("even")) {
                        int[] result = getLastEvenElements(numbersArray,count);
                        printArray(result);
                    } else if (tokens[2].equals("odd")) {
                        int[] result = getLastOddElements(numbersArray,count);
                        printArray(result);
                    }
                }
            }

            command = scanner.nextLine();
        }

        printArray(numbersArray);

    }

    private static int[] getLastOddElements(int[] numbersArray, int count) {
        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int index = 0;
        for (int i = numbersArray.length - 1; i >= 0; i--) {
            int digit = numbersArray[i];
            if (digit % 2 != 0 && index < result.length) {
                result[index] = digit;
                index++;
            }
        }
        int[] realResult = new int[result.length];
        int indexator = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            realResult[indexator] = result[i];
            indexator++;
        }
        return realResult;
    }

    private static int[] getLastEvenElements(int[] numbersArray, int count) {
        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int index = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            int digit = numbersArray[i];
            if (digit % 2 == 0 && index < result.length) {
                result[index] = digit;
                index++;
            }
        }
        int[] realResult = new int[result.length];
        int indexator = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            realResult[indexator] = result[i];
            indexator++;
        }
        return realResult;
    }

    private static int[] getFirstOddElements(int[] numbersArray, int count) {
        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int index = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            int digit = numbersArray[i];
            if (digit % 2 != 0 && index < result.length) {
                result[index] = digit;
                index++;
            }
        }
        return result;
    }

    private static void printArray(int[] numbersArray) {
        System.out.print("[");
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] == -1) {
                continue;
            }
            if (i == numbersArray.length - 1) {
                System.out.print(numbersArray[i]);
            } else if (numbersArray[i + 1] != -1){
                System.out.print(numbersArray[i] + ", ");
            } else {
                System.out.print(numbersArray[i]);
            }
        }
        System.out.println("]");
    }

    private static int[] getFirstEvenElements(int[] numbersArray, int count) {
        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int index = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            int digit = numbersArray[i];
            if (digit % 2 == 0 && index < result.length) {
                result[index] = digit;
                index++;
            }
        }
        return result;
    }

    private static int findMinOdd(int[] numbersArray) {
        int index = -1;
        int minEvenValue = Integer.MAX_VALUE;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 != 0 && numbersArray[i] <= minEvenValue) {
                minEvenValue = numbersArray[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMinEven(int[] numbersArray) {
        int index = -1;
        int minEvenValue = Integer.MAX_VALUE;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0 && numbersArray[i] <= minEvenValue) {
                minEvenValue = numbersArray[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMaxOdd(int[] numbersArray) {
        int index = -1;
        int maxOddValue = Integer.MIN_VALUE;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 != 0 && numbersArray[i] >= maxOddValue) {
                maxOddValue = numbersArray[i];
                index = i;
            }
        }
        return index;

    }

    private static int findMaxEven(int[] numbersArray) {
        int index = -1;
        int maxEvenValue = Integer.MIN_VALUE;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0 && numbersArray[i] >= maxEvenValue) {
                maxEvenValue = numbersArray[i];
                index = i;
            }
        }
        return index;
    }

    private static void rotateArray(int[] numbersArray, int index) {
        int[] left = new int[index + 1];
        int[] right = new int[numbersArray.length - left.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = numbersArray[i];
        }

        int indexator = 0;
        for (int i = left.length; i < numbersArray.length; i++) {
            right[indexator] = numbersArray[i];
            indexator++;
        }

        for (int i = 0; i < right.length; i++) {
            numbersArray[i] = right[i];
        }

        for (int i = right.length; i < numbersArray.length; i++) {
            numbersArray[i] = left[i - right.length];
        }

    }

    private static boolean isInRange(int[] numbersArray, int index) {
        return index < numbersArray.length && index >= 0;
    }
}
