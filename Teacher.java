public class Teacher {
    private int numCourses;
    private String[] courses;
    private static final int MAX = 30;

    public Teacher(String name, String address) {
        courses = new String[MAX];
        numCourses = 0;
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course))
                return false; // already exists
        }
        courses[numCourses++] = course;
        return true;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false; // not found
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }
}
