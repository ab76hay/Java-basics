class Course{
    static int MaxCapacity = 100;
    String courseName;
    int enrollment;
    String[] enrolledStudents;
    Course(String courseName){
        this.courseName = courseName; 
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }
     
    static void setMaxCapacity(int MaxCapacity){
        Course.MaxCapacity = MaxCapacity;
    }
    void enrollStudent(String studentName){
        enrolledStudent[enrollments] = studentName;
        enrollment++;

    }
    
    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }

}