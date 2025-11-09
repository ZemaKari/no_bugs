package practice_5v.park;

public class Attraction implements Info, Maintain{
    private  String name;
     public Attraction(String name){
         this.name= name;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void info() {

    }

    @Override
    public void maintain() {

    }
}
