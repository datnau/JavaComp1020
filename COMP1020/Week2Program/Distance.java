import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x1 = in.nextFloat();
        float x2 = in.nextFloat();
        float y1 = in.nextFloat();
        float y2 = in.nextFloat();

        float distance = distancePoints(x1, x2, y1, y2);
        System.out.println("Distance between the points: " + distance);

        in.close();
    }

    static float distancePoints(float x1, float x2, float y1, float y2) {
        float d = (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return d;
    }
}
