package practice_2v;

public class Circle {
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    int getRadius(){
        return this.radius;
    }

    void setRadius(int newRadius){
        this.radius = newRadius;
    }
    double calculateArea(){

        return Math.PI * Math.pow(this.radius ,2);
    }
    double calculateCircumference(){
        return 2* Math.PI * this.radius;
    }

}

