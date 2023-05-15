public class Main {

    static class Point {
        int x, y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(int[] coordinates) {

        Point a1 = new Point(coordinates[0], coordinates[1]);
        Point a2 = new Point(coordinates[2], coordinates[3]);
        Point b1 = new Point(coordinates[4], coordinates[5]);
        Point b2 = new Point(coordinates[6], coordinates[7]);

        int rectArea1 = Math.abs(a1.x - a2.x)
                * Math.abs(a1.y - a2.y);
        int rectArea2 = Math.abs(b1.x - b2.x)
                * Math.abs(b1.y - b2.y);

        int x1_intersect = Math.min(b2.x, a2.x);
        int x2_intersect = Math.max(a1.x, b1.x);
        int y1_intersect = Math.min(a2.y, b2.y);
        int y2_intersect = Math.max(a1.y, b1.y);

        int intersectArea = Math.abs((x1_intersect - x2_intersect)
                * (y1_intersect - y2_intersect));

        return rectArea1 + rectArea2 - intersectArea;
    }
    public static void main(String[] args) {

        int[] coordinates = {-3, 0, 3, 4, 0, -1, 9, 2};
        System.out.println(solution(coordinates));
    }
}