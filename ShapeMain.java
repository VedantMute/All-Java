interface Shape {
    public void area();
    public void perimeter();
    
}
class Circle implements Shape{
    float rad;
    Circle(float r){
        rad=r;
    }
    public void area(){
        System.out.println(3.14*rad*rad);
    }
    public void perimeter(){
        System.out.println(3.14*rad);
    }
}
public class ShapeMain
{
    public static void main(String[] args) {
        Circle cir = new Circle(2);
        cir.area();
        cir.perimeter();
    }
}