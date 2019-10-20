package P2;

public class CountOccurrences {
    public static int countOccurrences(int[] array, int key) {
        int left = 0;
        int right = array.length;
        int count = 0;
        int middle = (left + right) / 2;
        while (left <= right) {
            if (key < array[middle]) left = middle + 1;
            else if (key > array[middle]) right = middle - 1;
            else if (key == array[middle]) {
                count = 1;
                right = middle;
                left = middle;
                boolean a = false;
                boolean b = false;
                while (a == false) {
                    if (key != array[left]) a = true;
                    else {
                        count++;
                        left--;
                    }
                }
                while (b == false) {
                    if (key != array[right]) b = true;
                    else {
                        count++;
                        right++;
                    }
                }
            }
        }
        return count;

    }


//        int number = 0;
//        for (int i = 1; i < array.length; i++) if (array[i] == key) number++;
//        return number;



    public static void main(String[] args) {
        System.out.println("Checking input...");

        int[] array = {0, 2, 3, 5, 5, 5, 8, 11, 11, 101};

        int rez = countOccurrences(array, 11);
        System.out.println("You got: " + rez + " Correct: " + 2);
    }
}