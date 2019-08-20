package heightChecker;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] heights = new int[]{1, 1, 4, 2, 1, 3};
        int count = heightChecker(heights);
        System.out.println(count);
    }

    public static int heightChecker(int[] heights) {// 1 1 4 2 1 3
        int[] temp = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != temp[i]){
                count++;
            }
        }
        return count;
    }
}
