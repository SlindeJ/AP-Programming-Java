package CS220.take_home8;
import java.util.*;

public class SortByArea implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        if (s1.getArea() > s2.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }
}
