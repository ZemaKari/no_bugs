package practice_5v.farm;


public class FarmAnimal implements Productable{
    private String name;

    public FarmAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void feed() {
        System.out.print(this.getName());
    }

    @Override
    public void care() {
        System.out.print(this.getName());
    }

    @Override
    public void produce() {
        System.out.print(this.getName());
    }
}
