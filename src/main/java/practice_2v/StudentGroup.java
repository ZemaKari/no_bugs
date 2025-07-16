package practice_2v;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String someName, int someStudentCount){
        this.groupName = someName;
        this.studentCount = someStudentCount;
    }

    String getGroupName(){
        return  this.groupName;
    }
    int getStudentCount(){
        return this.studentCount;
    }
    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }
    void setStudentCount(int newStudentCount){
        this.studentCount= newStudentCount;
    }
    void printInfo(){
        System.out.println("группа "+ this.groupName+ ". количество студентов в ней: " + this.studentCount);
    }


}
