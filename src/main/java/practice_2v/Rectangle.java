package practice_2v;

public class Rectangle {
    int width;
    int height;

    Rectangle(int someWidth, int someHeigth){
        this.height = someHeigth;
        this.width = someWidth;

    }

    int getWidth(){
        return this.width;
    }
    int getHeight(){
        return this.height;
    }

    void setWidth(int newWidth){
        this.width = newWidth;
    }

    int calculateArea(){
        return this.width * this.height;

    }

}
