package practice_9v.function_interface;


//Задача:
// Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
// Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
@FunctionalInterface
public interface MathOperation {
    int apply(int a, int y);
}
