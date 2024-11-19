package CS220.take_home8_Comparator;

public class SortByPerimeter implements java.util.Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        if (s1.getPerimeter() > s2.getPerimeter()) {
            return 1;
        } else {
            return -1;
        }
    }
}
