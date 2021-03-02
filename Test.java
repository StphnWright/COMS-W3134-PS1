import java.util.Arrays;

public class Test {
    public static void main (String args[]) {
        Rectangle[] rectangles = new Rectangle[10];
        for(int i = 0; i < rectangles.length; i++) {
            double length = Math.random() * 10;
            double width = Math. random() * 10;
            rectangles[i] = new Rectangle(length, width);
        }
        Arrays.sort(rectangles);
        GenericMethods methods = new GenericMethods();
        int index = methods.binarySearch(rectangles, rectangles[7]);
        System.out.println(index);
    }
}
