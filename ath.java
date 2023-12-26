class Student {
    int r;
    float h;
    int w;
    
    Student(int rno, float height, int weight) {
        this.r = rno;
        this.h = height;
        this.w = weight;
    }
    
    void display() {
        System.out.println("Roll Number: " + r);
        System.out.println("Height: " + h);
        System.out.println("Weight: " + w);
    }
}

public class ath {
    public static void main(String[] args) {
        Student obj = new Student(39, 5.5f, 50);
        obj.display();
    }
}
