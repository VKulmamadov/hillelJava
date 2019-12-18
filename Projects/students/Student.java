package students;

public class Student {
    String Name;
    int[] Marks;
    boolean[] Lessons;

    public Student(String Name,int numberLessons){
        if (Name.length() < 2 ) {
            System.out.println("Name is not available");
            return;
        }
        if (numberLessons < 1 ) {
            System.out.println("Number of lessons is not available");
            return;
        }
        Marks = new int[numberLessons];
        Lessons = new boolean[numberLessons];
        this.Name = Name;
    }

    public void UpdateStudentInfo (int lesson, int mark){
        if(Marks.length < lesson || lesson < 0){
            System.out.println("Lesson not exist");
            return;
        }
        Marks[lesson] = mark;
    }
    public void UpdateStudentInfo (int lesson, int mark, boolean presence) {
        if (Marks.length < lesson || lesson < 0) {
            System.out.println("Lesson not exist");
            return;
        }
        if (mark > 0) {
            Marks[lesson] = mark;
        }
        Lessons[lesson] = presence;
    }
    public void PrintStudentInfo (){
        System.out.println(this.Name);
        for(int i = 0;i < Marks.length;i++){
            System.out.print("  Lesson "+i + ": " + Marks[i]);
            if(Lessons[i]){
                System.out.print(" was present\n");
            } else {
                System.out.print(" was absent\n");
            }
        }
    }
}
