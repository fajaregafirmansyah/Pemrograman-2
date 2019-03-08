package tugas05;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class Rectangle extends Shape {

    private final String name;
    private final long length;
    private final long width;

    public Rectangle(String name, long length, long width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return length * width;
    }

}
