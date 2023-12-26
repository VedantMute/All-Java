class Adder{
    int n1, n2, n3;
    Adder(int a, int b, int c)
    {
        this.n1=a;
        this.n2=b;
        this.n3=c;
    }
    Adder(int a, int b){
        this.n1=a;
        this.n2=b;
    }
     public void add(int x, int y){
        System.out.println("Addition is "+(x+y));  
    }
     public void add(int x, int y,int z){
        System.out.println("Addition is "+(x+y+z));
    }
}


public class ConstructorAndMethodOverloading {
    public static void main(String[] args) {
        Adder a1= new Adder(1,2,3);
        Adder a2= new Adder(1,2);
        a1.add(a1.n1, a1.n2, a1.n3);
        a1.add(a2.n1, a2.n2);
    }
}
