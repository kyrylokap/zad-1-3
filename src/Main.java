public class Main {
    public static void main(String[] args) {
        SvgScene scene = new SvgScene();
        Style style = new Style("none","black",3);
        Polygon sqr = Polygon.square(new Segment(new Vec2(250, 150), new Vec2(450, 250)),style);
//        SolidFilledPolygon pol2 = new SolidFilledPolygon(new Vec2[]{new Vec2(10, 10), new Vec2(70, 10), new Vec2(40, 50)}, "yellow");
//
//        SolidFillShapeDecorator shapeDec = new SolidFillShapeDecorator(sqr, "red");
//
//        Ellipse ell = new Ellipse(new Vec2(100.0, 100.0), 50.0, 50.0);
//        Ellipse ell2 = new Ellipse(new Vec2(180, 100.0), 50.0, 50.0);
//        SolidFillShapeDecorator decoratedEll = new SolidFillShapeDecorator(ell, "blue");
//        StrokeShapeDecorator decoratedEll2 = new StrokeShapeDecorator(decoratedEll, "red", 3);
        Shape polygon = new Polygon(new Vec2[]{
                new Vec2(500, 100),
                new Vec2(220, 20),
                new Vec2(400, 25),
                new Vec2(70, 33),
        });


        TransformationDecorator.Builder builder = new TransformationDecorator.Builder();
        Shape s = builder
                .rotate(-50, new Vec2(0, 0))
                .translate(new Vec2(50, 60))
                .scale(new Vec2(1, 1.5))
                .build(new Ellipse(new Vec2(40, 50), new Vec2(20,70), style));
        Shape shape = builder.scale(new Vec2(20, 10)).build(polygon);

//        scene.add(shapeDec);
//        scene.add(pol2);
////        scene.add(decoratedEll);
//        scene.add(decoratedEll2);
        scene.add(s);
        scene.save("scene.html");
    }
}