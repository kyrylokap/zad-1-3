public class SolidFilledPolygon extends Polygon {
    private String color;
    public SolidFilledPolygon(Vec2[] points_tab, String color) {
        super(points_tab);
        this.color=color;
    }
    public String toSvg(String parameters) {
        return super.toSvg("fill=\""+color+"\" "+parameters);
    }
}
