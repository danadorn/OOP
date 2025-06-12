import java.math.BigDecimal;

// interface
interface Service{
    void display(); // called abstract method
}
// base class or super class
public class Person {
    // state or fields
    String name;
    String email;
    String gender;
    int age;
    String position;

    // method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
}

// subclass (person and student called single inheritance)
class Student extends Person {
    int id;
    String major;

    // method
    public void studentDisplay() {
        System.out.println("Id: " + id);
        System.out.println("Major: " + major);
        super.display();
    }
}

class TopStudent extends Student {
    String project;

    // method
    public void studentDisplay() {
        System.out.println("Project: " + project);
    }
}

// hierarchical inheritance
class Employee extends Person {
    int employeeId;
    BigDecimal salary;

}

// multiple inheritance
class ClubMember extends Person  implements Service{
    int clubId;
}

// hybrid inheritance(inherit ClubMember also include class Person and clas Service )
class ClubMember2 extends ClubMember implements Service{
    int numberOfClubs;
}

//implement
class Mom extends Person implements Service{
    String momName;
}

