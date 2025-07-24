package practice_3v;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;

    }
     String getFirstName(){
        return this.firstName;

     }

     String getLastName(){
        return this.lastName;

     }
      String getSsn(){
        return  this.ssn;
      }
// сделаем этот метод недоступным вне класса
      private void setFirstName(String newFirstName){
        this.firstName = newFirstName;

      }

// этот метод сделаем по дефолту для сравнения с privet методом. Этот доступен вне класса.
      void setLastName(String newLastName){
        this.lastName = newLastName;

      }
      void printPersonInfo(){
          System.out.println("Имя: "+ this.getFirstName() + ". Фамилия: "+ this.getLastName()+ ". SSN: " + this.ssn);
      }



}
