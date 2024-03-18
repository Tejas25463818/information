public class student {
    String name, program, course;
    int semester;
    int marks;
    public student(String name, String program, String course, int semester, int marks) {
        this.name = name;
        this.program = program;
        this.course = course;
        this.semester = semester;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Name: " + name + "\nProgram: " + program + "\nSemester: " + semester + "\nCourse: " + course + "\nMarks: " + marks);
    }
}

 class program {
    public static void main(String[] args) {
        student student1 = new student("name1", "bca", "english", 4, 40);
        student student2 = new student("name2", "bca", "devops", 4, 58);

        System.out.println("Displaying details:\n");

        student1.displayDetails();
        student2.displayDetails();
    }
}
