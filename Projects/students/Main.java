package students;

public class Main {
    public static void main(String[] args) {
        Student Anton = new Student("Anton", 5);
        Anton.UpdateStudentInfo(0,10,true);
        Anton.UpdateStudentInfo(1,0,false);
        Anton.UpdateStudentInfo(2,5,true);
        Anton.PrintStudentInfo();
    }
}
