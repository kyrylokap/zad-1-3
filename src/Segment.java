import java.util.Locale;

public class Segment {
    private Point first,second;
    Segment(Point first,Point second){
        this.first = first;
        this.second = second;
    }
    public double returnLength(){
        return Math.sqrt(Math.pow((second.x - first.x)+(second.y) - first.y,2));
    }
    public String toSvg(){
        //return "<line x1 ='" +first.x  +"' y1 = '" + first.y+ "' x2 = '" + second.x+ "' y2= '"+ second.y +"stroke=\"black\"/>";
    return String.format(Locale.ENGLISH,"<line x1 = '%f' y1 = '%f' x2 = '%f' y2 = '%f' stroke = 'black'/>",first.x,first.y,second.x,second.y);
    }
    public static Segment[] perpendicularSegments(Segment segment, Point point) {
        double dX = segment.second.x - segment.first.x;
        double dY = segment.second.y - segment.first.y;

        double perpDx1 = -dY;
        double perpDy1 = dX;

        double perpDx2 = dY;
        double perpDy2 = -dX;

        Point endPoint = new Point(point.x + perpDx1, point.y + perpDy1);
        Point endPoint2 = new Point(point.x + perpDx2, point.y + perpDy2);

        Segment segment1 = new Segment(point, endPoint);
        Segment segment2 = new Segment(point, endPoint2);

        return new Segment[]{segment1, segment2};
    }
}
