package practice_8v.generic_task3;

public class Peir <T, U>{
    private T elementOne;
    private U elementTwo;

    public Peir(T elementOne,U elementTwo ) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public T getElementOne() {
        return elementOne;
    }

    public void setElementOne(T elementOne) {
        this.elementOne = elementOne;
    }

    public U getElementTwo() {
        return elementTwo;
    }

    public void setElementTwo(U elementTwo) {
        this.elementTwo = elementTwo;
    }
}



