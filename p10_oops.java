// class Employee{
//     int salary;
//     String name;
//     public int getSalary()
//     {
//         return salary;
//     }
//     public String getname()
//     {
//         return name;
//     }
//     public void setName(String n){
//         name=n;
//     }
  
// }
// public class p10_oops {
//     public static void main(String[] args) {
//         Employee vedant= new Employee();
//         vedant.salary=7;
//         vedant.name="vdnt";
//         vedant.setName("orange");
//         System.out.println(vedant.getSalary());
//         System.out.println(vedant.getname());
//     }
// }
// ----------------------------------------------------------
class Square
{
    int side;
    public int setside(int n)
    {
        side =n;
        return side;
    }
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
public class p10_oops {
    public static void main(String[] args) {
        Square sq =new Square();
        sq.setside(5);
        System.out.println("Area is"+sq.area());
        System.out.println("Area is"+sq.perimeter());
    }
}