public class SchoolApplication {

    public static void main(String[] args) {

        // ---- Question 10: construct all of the classes and call toString() ----
        Person jack = new Person("Jack Brooke", 27, "M");
        System.out.println(jack);

        Student beth = new Student("Elisabeth Smith", 16, "F", "122233");
        System.out.println(beth);

        Teacher sam = new Teacher("Sam Hamilton", 34, "M", "Computer Science", 50000);
        System.out.println(sam);

        // setters and getters
        beth.setFee(9250);
        beth.setGrade("A");
        beth.setAge(17);
        System.out.println(beth.getName() + " now: " + beth);

        sam.setSubject("Chemistry");
        sam.setSalary(52000);
        System.out.println(sam.getName() + " now: " + sam);

        // ---- Question 11: which statements are correct? ----
        System.out.println();

        // CORRECT: a Teacher "is a" Person, so a Person variable can refer to a Teacher.
        Person p = new Teacher("Sam Hamilton", 34, "M", "Computer Science", 50000);

        // WRONG: does not compile. A Person is not necessarily a Teacher, so a
        // Teacher variable cannot refer to a Person ("incompatible types: Person
        // cannot be converted to Teacher"). Person also has no constructor
        // taking 5 arguments.
        // Teacher t = new Person("Sam Hamilton", 34, "M", "Computer Science", 50000);

        // CORRECT: a Student "is a" Person.
        Person s = new Student("Elisabeth Smith", 16, "F", "122233");

        // Polymorphism: the variables are of type Person, but the toString()
        // that runs is the one of the actual object (Teacher / Student).
        System.out.println(p);
        System.out.println(s);
        System.out.println("p is a Teacher: " + (p instanceof Teacher));
        System.out.println("s is a Student: " + (s instanceof Student));

        // Through a Person variable only the Person methods are visible:
        // p.getSalary() would not compile, the object has to be cast back first.
        Teacher pAsTeacher = (Teacher) p;
        System.out.println("Salary of p: " + pAsTeacher.getSalary());

        // ---- Question 12: each teacher has 3 students as personal tutees ----
        System.out.println();

        Student tom = new Student("Tom Baker", 15, "M", "122234");
        Student amy = new Student("Amy Wong", 16, "F", "122235");
        Student leo = new Student("Leo Grant", 17, "M", "122236");

        sam.addTutee(beth);
        sam.addTutee(tom);
        sam.addTutee(amy);

        // a teacher cannot have more than 3 tutees
        System.out.println("Fourth tutee added: " + sam.addTutee(leo));

        System.out.println("Tutees of " + sam.getName() + ":");
        for (Student tutee : sam.getTutees()) {
            System.out.println("  " + tutee);
        }
    }
}
