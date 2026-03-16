package practice_8v.generic_task2;

public class AnyClass<T> {
    private T[] element;

    public AnyClass(T[] element){
        this.element = element;
    }

    public T[] getElement() {
        return element;
    }

    public void printElement(T[] element){
        for(T elem : element){
            System.out.println(elem);
        }
    }
}
