public class p11_public_specifier {


    class Employee{
        private int id;
        private String name;

        public void setId(int i)
        {
            id=i;
        }
        public void setName(String n)
        {
            name=n;
        }
        public int getId()
        {
            return id;
        }
        public String getName()
        {
            return name;
        }
    }
    
    public static void main(String[] args) {

        p11_public_specifier outerClass = new p11_public_specifier();
        Employee emp = outerClass.new Employee();
        emp.setId(5);
        emp.setName("hello");
        System.out.println(emp.getName());
        System.out.println(emp.getId());
    }
}
