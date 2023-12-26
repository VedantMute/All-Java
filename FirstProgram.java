interface Shape2 {
    void area();
    void perimeter();
}

class Circle1 implements Shape2 {
    private int r;

    Circle1(int r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println("Area of circle is " + 3.14 * (r * r));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of circle is " + (2 * 3.14 * r));
    }
}

class Rectangle1 implements Shape2 {
    private int a, b;

    Rectangle1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle is " + (a * b));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of rectangle is " + (2 * (a + b)));
    }
}

public class FirstProgram {
    public static void main(String[] args) {
        // Create instances of classes implementing the Shape2 interface
        Circle1 cr = new Circle1(10);
        Rectangle1 rec = new Rectangle1(10, 20);

        // Call methods defined in the Shape2 interface
        cr.area();
        cr.perimeter();
        rec.area();
        rec.perimeter();
    }
}
