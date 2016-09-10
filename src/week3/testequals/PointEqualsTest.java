package week3.testequals;

/**
 * Created by 1 on 30.05.2016.
 */
public class PointEqualsTest {
    public static void main(String[] args) {
        System.out.println("Сравниваем обычную точку и цветную точку:");
        Point p1 = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println("p equals cp = " + p1.equals(cp));
        System.out.println("cp equals p = " + cp.equals(p1));

        ColorPoint cp1 = new ColorPoint(2, 10, Color.RED);
        System.out.println("cp equals cp1 = " + cp.equals(cp1));

    }
}
