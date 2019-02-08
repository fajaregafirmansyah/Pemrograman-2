package tugas5;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class Circle extends Shape {

    private final float radius;
    private final String name;

    public Circle(float radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
