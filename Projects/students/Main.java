package students;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student [] StudentsList = new Student[3];

        AddStudent("Petrov", 3,StudentsList);
        AddStudent("Anton", 3,StudentsList);
        AddStudent("Buryak", 3,StudentsList);
        System.out.println("Add studets is ok");

        int indexOfStudent = ContainsStudent("Anton",StudentsList);
        StudentsList[indexOfStudent].UpdateStudentInfo(0,10,true);
        StudentsList[2].UpdateStudentInfo(2,7,true);
        PrintStudents(StudentsList);

        System.out.println("Sort students:");
        SortStudents(StudentsList);
        PrintStudents(StudentsList);

        System.out.println("Delete one student:");
        DeleteStudent("Buryak",StudentsList);
        PrintStudents(StudentsList);

        ClearStudents(StudentsList);
        System.out.println("after clear:");
        PrintStudents(StudentsList);
    }

    public static void AddStudent (String Name,int numberLessons, Student [] StudentsList){
        int index = -1;
        for (int i = 0;i<StudentsList.length;i++){
            if(StudentsList[i] == null){
                index = i;
                break;
            }
        }
        if (index < 0){
            System.out.println("Too many students in list");

        } else {
            StudentsList[index] = new Student(Name,numberLessons);
            System.out.println("Student position is "+index);

        }
    }

    public static void PrintStudents(Student[] StudentsList){
        for (int i = 0;i < StudentsList.length;i++){
            if(StudentsList[i] != null){
                System.out.print(i + ". ");
                StudentsList[i].PrintStudentInfo();
            }
        }

    }

    public static void DeleteStudent(String Name,Student [] StudentsList){
        //TODO: add exeption for same Names
        int index = ContainsStudent(Name,StudentsList);
            if (index > -1){
               StudentsList[index] = null;
            } else {
                System.out.println("Student not exist");
            }
            SortStudents(StudentsList);
    }

    public static int ContainsStudent(String Name, Student[] StudentsList){
        for (int i = 0; i < StudentsList.length; i++) {
            if (StudentsList[i].Name.equals(Name)){
                return i;
            }
        }
        return -1;
    }

    public static void SortStudents (Student [] StudentsList){
        Student Temp;
        for (int i = 0; i < StudentsList.length-1; i++) {
            for (int j = 0; j < StudentsList.length-1; j++) {
                if(StudentsList[j] == null){
                    StudentsList[j] = StudentsList[j+1];
                    StudentsList[j+1] = null;
                    continue;
                } else if(StudentsList[j+1] == null){
                    continue;
                }
                if (StudentsList[j].Name.compareTo(StudentsList[j+1].Name) > 0){
                    Temp = StudentsList[j];
                    StudentsList[j] = StudentsList[j+1];
                    StudentsList[j+1] = Temp;
                }
            }
        }
    }
    
    public static void ClearStudents(Student[]StudentsList){
//        for (int i = 0;i < StudentsList.length;i ++) {
        Arrays.fill(StudentsList,null);
//            StudentsList[i] = null;
//        }
    }
}
