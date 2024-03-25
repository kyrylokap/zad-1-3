import java.util.Locale;

public class Polygon {
     private Point []points;
     private Style style;
    public Polygon(Point[] points,Style style){
        this.points = points;
        this.style = style;
    }
    public String toSvg(){
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<polygon points=\"");
        for(Point point:points){
            stringbuilder.append(point.x).append(",").append(point.y).append(" ");
        }
        stringbuilder.append("\n").append("\" style=\"fill:none;stroke:black;stroke-width:1\"/>\n");

        return stringbuilder.toString();
    }
    public Polygon(Polygon src){
        this.points = new Point[src.points.length];
        for(int i = 0;i < points.length;i++){
            this.points[i] = new Point(src.points[i].x,src.points[i].y);
        }

    }
    public Polygon(Style style){
        this.style = new Style("none" ,"black",1.0);
    }
}
