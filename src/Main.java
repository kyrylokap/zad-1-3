public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0.0,0.0);
        Point point2 = new Point(2.0,2.0);
        Segment segment = new Segment(point1,point2);
        System.out.println(segment.toSvg());

        Point[] pointsArray = {new Point(50, 50), new Point(50, 20), new Point(100, 20),new Point(100, 50)};

        Style style = new Style("aaa","sss",1.0);


        Polygon polygon = new Polygon(pointsArray,style);

       // System.out.println(polygon.toSvg());
        Polygon polygon2 = new Polygon(polygon);
        System.out.println(polygon2.toSvg());
        polygon = new Polygon(style);
        SvgScene svg = new SvgScene();
        svg.addPolygon(polygon);

    }
}
