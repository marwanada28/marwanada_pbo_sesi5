import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data Student
        System.out.print("Masukkan nama mahasiswa: ");
        String sName = input.nextLine();
        System.out.print("Masukkan alamat mahasiswa: ");
        String sAddr = input.nextLine();
        Student student = new Student(sName, sAddr);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int count = input.nextInt();
        input.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Mata kuliah ke-" + (i + 1) + ": ");
            String course = input.nextLine();
            System.out.print("Nilai: ");
            int grade = input.nextInt();
            input.nextLine();
            student.addCourseGrade(course, grade);
        }

        student.printGrades();
        System.out.println("Rata-rata: " + student.getAverageGrade());

        // Input data Teacher
        System.out.print("\nMasukkan nama dosen: ");
        String tName = input.nextLine();
        System.out.print("Masukkan alamat dosen: ");
        String tAddr = input.nextLine();
        Teacher teacher = new Teacher(tName, tAddr);

        System.out.print("Masukkan jumlah mata kuliah yang diajar: ");
        int tCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < tCount; i++) {
            System.out.print("Mata kuliah ke-" + (i + 1) + ": ");
            String course = input.nextLine();
            if (!teacher.addCourse(course)) {
                System.out.println("Mata kuliah sudah ada.");
            }
        }

        System.out.println(student);
        System.out.println(teacher);

        input.close();
    }
}
