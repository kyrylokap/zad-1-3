import java.util.List;
import java.util.ArrayList;

public class SvgScene {
    private ArrayList<Polygon>polygons;
    public SvgScene() {
        polygons = new ArrayList<>();
    }
    public void addPolygon(Polygon src){
            polygons.add(src);

    }

}
