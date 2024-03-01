public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "MATH101", "MATH");
        Course physics = new Course("Physics", "PHYS101", "PHYS");
        Course chemistry = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher teacherOne = new Teacher("Kürs Sıtkı", "90550000055", "+9005315388832");
        Teacher teacherTwo = new Teacher("Paşa Nuri", "90500005555", "+9005385323233");
        Teacher teacherThree = new Teacher("Kemal Hoca", "90550000555", "+9005515693234");

        math.addTeacher(teacherOne);
        physics.addTeacher(teacherTwo);
        chemistry.addTeacher(teacherThree);

        Student studentOne = new Student("İnek Şaban", 4, "19685015", math, physics, chemistry);
        studentOne.math.performanceNote = 50;
        studentOne.physics.performanceNote = 30;
        studentOne.chemistry.performanceNote =50;
        studentOne.addBulkExamNote(50,20,40);
        studentOne.isPass();

        Student studentTwo = new Student("Güdük Necmi", 4, "20685015", math, physics, chemistry );
        studentTwo.math.performanceNote = 50;
        studentTwo.physics.performanceNote = 30;
        studentTwo.chemistry.performanceNote =50;
        studentTwo.addBulkExamNote(100,50,40);
        studentTwo.isPass();

        Student studentThree = new Student("Hayta İsmail", 4, "22685015", math, physics, chemistry );
        studentThree.math.performanceNote = 80;
        studentThree.physics.performanceNote = 90;
        studentThree.chemistry.performanceNote =74;
        studentThree.addBulkExamNote(50,20,40);
        studentThree.isPass();

    }
}