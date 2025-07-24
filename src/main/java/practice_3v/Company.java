package practice_3v;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    static {
        companyName = "Sony";
    }
    Company(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName(){
        System.out.println("Компания: " + Company.companyName);
    }

    String getEmployeeName(){
        return this.employeeName;
    }

    void setEmployeeName( String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

    String getCompanyName(){
        return Company.companyName;
    }

    static void setCompanyName(String newCompanyName){
        Company.companyName = newCompanyName;
    }

}
