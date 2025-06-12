//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TopStudent top1: called create reference

        Student student1 = new Student();
        TopStudent topStudent1 = new TopStudent();
        Employee employee1 = new Employee();
        ClubMember clubMember1 = new ClubMember();
        ClubMember2 clubMember2 = new ClubMember2();

        student1.display();
        topStudent1.display();
        employee1.display();
        clubMember1.display();
        clubMember2.display();
    }
}