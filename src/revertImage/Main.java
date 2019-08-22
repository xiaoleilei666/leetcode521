package revertImage;

public class Main {
    public static void main(String[] args) {

    }
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] array : A) {
            flipAndInvertImage(array);
        }
        return A;
    }

    private void flipAndInvertImage(int[] array) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] == array[j]) {
                array[i] = array[i] == 0 ? 1 : 0;
                array[j] = array[i];
            }
            i++;
            j--;
        }
        if (i == j) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
    }
}
