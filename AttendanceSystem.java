import java.util.*;

// -------------------- Model Classes --------------------
class Student {
    private int id;
    private String name;
    private double attendancePercentage;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.attendancePercentage = 0.0;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getAttendancePercentage() { return attendancePercentage; }

    public void setAttendancePercentage(double percentage) {
        this.attendancePercentage = percentage;
    }

    @Override
    public String toString() {
        return id + " - " + name + " | Attendance: " + attendancePercentage + "%";
    }
}

class Faculty {
    private int id;
    private String name;

    public Faculty(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
}

// -------------------- Services --------------------
class AttendanceService {
    private Map<Integer, Integer> attendanceMap = new HashMap<>();

    public void markAttendance(Student student, boolean present) {
        int total = attendanceMap.getOrDefault(student.getId(), 0);
        if (present) total++;
        attendanceMap.put(student.getId(), total);

        double percentage = (total / 30.0) * 100; // assume 30 total classes
        student.setAttendancePercentage(percentage);
    }
}

class UserService {
    private List<Student> students = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public void addStudent(Student s) { students.add(s); }
    public void addFaculty(Faculty f) { faculties.add(f); }

    public List<Student> getAllStudents() { return students; }
    public List<Faculty> getAllFaculty() { return faculties; }

    public Student getStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
}

// -------------------- Main Class --------------------
public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        AttendanceService attendanceService = new AttendanceService();

        // Default admin credentials
        Admin admin = new Admin("admin", "1234");

        while (true) {
            System.out.println("\n=== Attendance Management System ===");
            System.out.println("1. Admin Login");
            System.out.println("2. Faculty Login");
            System.out.println("3. Student Login");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Admin
                    System.out.print("Enter Admin Username: ");
                    String u = sc.next();
                    System.out.print("Enter Password: ");
                    String p = sc.next();
                    if (u.equals(admin.getUsername()) && p.equals(admin.getPassword())) {
                        System.out.println("✅ Admin Logged In!");
                        System.out.println("1. Add Student\n2. Add Faculty\n3. View Students\n4. View Faculty");
                        int ac = sc.nextInt();
                        if (ac == 1) {
                            System.out.print("Enter Student ID & Name: ");
                            int sid = sc.nextInt();
                            String sname = sc.next();
                            userService.addStudent(new Student(sid, sname));
                        } else if (ac == 2) {
                            System.out.print("Enter Faculty ID & Name: ");
                            int fid = sc.nextInt();
                            String fname = sc.next();
                            userService.addFaculty(new Faculty(fid, fname));
                        } else if (ac == 3) {
                            for (Student s : userService.getAllStudents()) System.out.println(s);
                        } else if (ac == 4) {
                            for (Faculty f : userService.getAllFaculty()) System.out.println(f);
                        }
                    } else {
                        System.out.println("❌ Invalid Admin Credentials!");
                    }
                    break;

                case 2: // Faculty
                    System.out.println("✅ Faculty Logged In!");
                    System.out.print("Enter Student ID to mark attendance: ");
                    int sid = sc.nextInt();
                    Student st = userService.getStudentById(sid);
                    if (st != null) {
                        System.out.print("Present? (true/false): ");
                        boolean present = sc.nextBoolean();
                        attendanceService.markAttendance(st, present);
                        System.out.println("✔ Attendance Updated!");
                    } else {
                        System.out.println("❌ Student not found!");
                    }
                    break;

                case 3: // Student
                    System.out.println("✅ Student Login!");
                    System.out.print("Enter Student ID: ");
                    int sid2 = sc.nextInt();
                    Student st2 = userService.getStudentById(sid2);
                    if (st2 != null) {
                        System.out.println("Welcome " + st2.getName());
                        System.out.println("Your Attendance: " + st2.getAttendancePercentage() + "%");
                    } else {
                        System.out.println("❌ Student not found!");
                    }
                    break;

                case 4:
                    System.out.println("🚪 Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid Choice!");
            }
        }
    }
}
