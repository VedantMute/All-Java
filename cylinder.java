class cylinderArea{
    private int radius;
    private int height;

    public int getRadius(){
       return radius;
    }
    public int getHeight(){
       return height;
    }
    public void setRadius(int radius){
       this.radius=radius;
    }
   
    public void setHeight(int height){
       this.height=height;
    }
   
}



public class cylinder {
    public static void main(String[] args) {
        cylinderArea ca = new cylinderArea();
        ca.setRadius(10);
        System.out.println("radius"+ca.getRadius());
        ca.setHeight(10);
        System.out.println("height"+ca.getHeight());
        int x= ca.getHeight();
        int y= ca.getRadius();
        System.out.println("Area:"+(2*3.14*x*y));
    }   
}
