abstract class Base{
    public void func1()
    {
        System.out.println("Func 1");
    }
    abstract public void abs();
}
class Derived1 extends Base{
    public void abs()
{
        System.out.println("Abstract method");
    }
}
// TYPE 1
class Derived2 extends Base{
    public void abs(){
        System.out.println("Abstract method d2");
    }
}
// Type 2
abstract class Derived3 extends Base{
    public void abs1(){
        System.out.println("Abstract method");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Derived2 d2= new Derived2();
        d2.abs();
    }
}
