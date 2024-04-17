public class Polygon implements Shape{
    private Vec2[] points_tab;
    private Style style;

    public Polygon(Vec2[] points_tab){
        new Style("none","black",1);
        this.points_tab=points_tab;
    }

    public Polygon(Vec2[] points_tab, Style style){
        this.style=style;
        this.points_tab=points_tab;
    }

    public Polygon(Polygon poly){
        new Style(poly.style.fillColor, poly.style.strokeColor, poly.style.strokeWidth);
        this.points_tab = new Vec2[poly.points_tab.length];
        for(int i=0;i< points_tab.length;i++) {
            this.points_tab[i] = new Vec2(poly.points_tab[i].x, poly.points_tab[i].y);
        }
    }

    public String toSvg(String parameters) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<polygon points=\"");
        for(Vec2 p: points_tab) {
            stringBuilder.append(p.x).append(",").append(p.y).append(" ");
        }
        stringBuilder.append("\" ").append(parameters).append("/>");
        return stringBuilder.toString();
    }

    public static Polygon square(Segment segment, Style style) {
        Vec2 pointH = new Vec2(((segment.getStartPoint().x+segment.getEndPoint().x)/2),((segment.getStartPoint().y+segment.getEndPoint().y)/2));
        Segment segmentH = new Segment(segment.getStartPoint(),pointH);
        Segment[] secR = Segment.perpendicularSegments(segmentH,pointH);
        Vec2[] pointsTab = {segment.getStartPoint(),secR[0].getEndPoint(),segment.getEndPoint(),secR[1].getEndPoint()};
        return new Polygon(pointsTab,style);
    }
}
