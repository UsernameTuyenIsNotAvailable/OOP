public class PersonTest {


    public static void main(String[] args) {
        Person person = new Person(87,"d",6);
        Person person2 = new Person( 67,"345",4);
        System.out.println(person.getAge());
        System.out.println(person2.getAge());
        System.out.println(person.getName());
        System.out.println(person2.getName());
        System.out.println(person.getHeight());
        System.out.println(person2.getHeight());
        if (person.getAge() == person2.getAge() ){
            System.out.println( "person is the same");

        } else  { System.out.println( "person is not the same"); }
    }


}
