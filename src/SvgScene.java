import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class SvgScene {
    private List<Shape> shapes;
    private static SvgScene instance = null;

    private String defs[];
    public static SvgScene getInstance(SvgScene instance) {
        if(instance == null){
            SvgScene.instance = instance;
            return instance;
        }else{
            return instance;
        }
    }

    public SvgScene() {
        this.shapes = new ArrayList<>();
    }

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public void save(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body><svg width=\"1024\" height=\"768\" xmlns=\"http://www.w3.org/2000/svg\">\n");

        for(Shape i:shapes) {
            sb.append(i.toSvg(""));
            sb.append("\n");
        }

        sb.append("</svg></body></html>");

        FileWriter writer = null;
        try {
            writer = new FileWriter(string);
            writer.write(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
