package valueAndQuote;

import java.awt.*;

/**
 * @author menglei
 * @created by 2019/08/20
 * @version 1.0.0
 * Java中的基本类型和引用类型变量
 */
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Point p2 = new Point(2,3);
        System.out.println("outer point:"+"p1.x = "+ p1.x+"  p1.y = "+p1.y);
        System.out.println("outer point:"+"p2.x = "+ p2.x+"  p2.y = "+p2.y);
        trick(p1, p2);
        System.out.println("outer point:"+"p1.x = "+ p1.x+"  p1.y = "+p1.y);
        System.out.println("outer point:"+"p2.x = "+ p2.x+"  p2.y = "+p2.y);
    }

    private static void trick(Point arg1, Point arg2) { //实参将地址拷贝给形参，形参在怎么变，实参不变。
        arg1.x = 100;//如果方法内对该对象的成员数据进行操作，则会真正的改变该对象；
        arg1.y = 100;
        Point temp = arg1;
        System.out.println(temp.x + " " + temp.y);
        arg1 = arg2;//如果对该对象的地址引用进行操作，则不会改变参数源。
        System.out.println(arg1.x + " " + arg1.y);
        arg2 = temp;
        System.out.println("inner point:"+"arg1.x = "+ arg1.x+"  arg1.y = "+arg1.y);//2 3
        System.out.println("inner point:"+"arg2.x = "+ arg2.x+"  arg2.y = "+arg2.y);//100 100
    }

}
