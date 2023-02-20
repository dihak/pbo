# SESI 5 - TUGAS ENCAPSULATION

Buatkan class Main untuk memanggil dan membuat simulasi dengan Inputan
Scanner().

(Simulasikan program dengan data-data yang dibutukan seperti nama
Mahasiswa, Dosen, Mata Kuliah yang diampu dan lain-lain)

Jawaban:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data for student
        System.out.println("Enter student's name:");
        String studentName = input.nextLine();
        System.out.println("Enter student's age:");
        int studentAge = input.nextInt();
        input.nextLine(); // consume remaining newline character
        System.out.println("Enter student's major:");
        String studentMajor = input.nextLine();
        System.out.println("Enter student's GPA:");
        double studentGpa = input.nextDouble();

        // Create student object
        Student student = new Student(studentName, studentAge, studentMajor, studentGpa);

        // Input data for teacher
        System.out.println("Enter teacher's name:");
        String teacherName = input.next();
        System.out.println("Enter teacher's age:");
        int teacherAge = input.nextInt();
        input.nextLine(); // consume remaining newline character
        System.out.println("Enter teacher's department:");
        String teacherDepartment = input.nextLine();
        System.out.println("Enter course taught:");
        String courseTaught = input.nextLine();

        // Create teacher object
        Teacher teacher = new Teacher(teacherName, teacherAge, teacherDepartment, courseTaught);

        // Display information
        System.out.println("Student's Information:");
        System.out.println(student.toString());

        System.out.println("\nTeacher's Information:");
        System.out.println(teacher.toString());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Student extends Person {
    private String major;
    private double gpa;

    public Student(String name, int age, String major, double gpa) {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMajor: " + major + "\nGPA: " + gpa;
    }
}

class Teacher extends Person {
    private String department;
    private String courseTaught;

    public Teacher(String name, int age, String department, String courseTaught) {
        super(name, age);
        this.department = department;
        this.courseTaught = courseTaught;
    }

    public String getDepartment() {
        return department;
    }

    public String getCourseTaught() {
        return courseTaught;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + department + "\nCourse Taught: " + courseTaught;
    }
}
```

## Output

```text
Enter student's name:John Doe
Enter student's age:20
Enter student's major:Computer Science
Enter student's GPA:3.5
Enter teacher's name:Jane Doe
Enter teacher's age:30
Enter teacher's department:Computer Science
Enter course taught:Programming

Student's Information:
Name: John Doe
Age: 20
Major: Computer Science
GPA: 3.5

Teacher's Information:
Name: Jane Doe
Age: 30
Department: Computer Science
Course Taught: Programming
```

