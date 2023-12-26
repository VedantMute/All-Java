public class Rectangle {
    public int w, l , a;
    public String c;
    Rectangle(int width, int length, String color)
    {
        this.w= width;
        this.l= length;
        this.c= color;
    }
    public void rectArea()
    {
        a= l*w;
        System.out.println("Area: of "+c+" is "+a);
    }
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(5, 6, "Red");
        Rectangle r2= new Rectangle(10, 10, "Yellow");
        r1.rectArea();
        r2.rectArea();
    }
}
