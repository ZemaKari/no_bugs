package practice_8v.generic_task3;

public class OneMoreClass {
    private Integer number;

    public OneMoreClass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "OneMoreClass{" +
                "number=" + number +
                '}';
    }
}
