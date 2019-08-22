package hammingDistance;


public class Main {

    public static void main(String[] args) {
        int
                x = 1,
                y = 4;
        int count = hammingDistance(x, y);
        int count1 = hammingDistance1(x, y);
        System.out.println(count1);
    }

    public static int hammingDistance(int x, int y) {
        //十进制转换成二进制方法
        String x1, y1;
        x1 = Integer.toBinaryString(x);
        y1 = Integer.toBinaryString(y);
        while (x1.length() != y1.length()) {
            if (y1.length() > x1.length()) {
                x1 = "0" + x1;
            } else {
                y1 = "0" + y1;
            }
        }
        int index = 0;
        for (int i = 0; i < x1.length(); i++) {
            if (x1.charAt(i) != y1.charAt(i)) {
                index++;
            }
        }
        return index;
    }

    public static int hammingDistance1(int x, int y) {
        int m = x ^ y;
        System.out.println("m="+m);
        int num = 0;
        while (m != 0) {
            num += m & 1;
            System.out.println("num="+num);
            //>>= 作用效果 0101(5) --> 0010(2) --> 0001(1) -->0000(0)
            m >>= 1;
            System.out.println("m1="+m);
        }
        return num;

    }
}
