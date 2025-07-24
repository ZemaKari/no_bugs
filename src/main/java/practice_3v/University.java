package practice_3v;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    static{
        universityName = "MIT";
    }
    University(String studentName, int studentID){
        this.studentName =studentName;
        this.studentID = studentID;

    }

    static String changeUniversityName(String newName){
        return University.universityName = newName;

    }

    String getStudentName(){
        return this.studentName;

    }

    void printStudentInfo(){
        System.out.println("Имя студента: "+ this.studentName +
                ". ID студента: "+ this.studentID + ". Университет: " + University.universityName);
    }

}
