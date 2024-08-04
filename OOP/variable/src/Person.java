import java.util.Observable;

public class Person extends Object {

    String name;
    int age;
    double height;

    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
        p.setHeight(143);
        p.setAge(21);
        p.setName("tuyen");
        System.out.println(p.getName() + " Age " + p.getAge() + " Height " + p.getHeight());
    }

    public Person() {
        System.out.println("Person Constructor");
    }


    public Person(double height, String name, int age) {

        this.height = height;
        this.name=name;
        this.age= age;
    }


    public double getHeight() {
        //this
        return height;
    }

    public  void setHeight(double height) {
        //this
         this.height=height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
}



