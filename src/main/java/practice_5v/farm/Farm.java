package practice_5v.farm;

public class Farm {
    private FarmAnimal animal;
    public void setAnimal(FarmAnimal farmAnimal){
        this.animal = animal;
    }

    public  void  addAnimal(FarmAnimal animal){
        this.animal  = animal;
    }

    public void serviceAnimal(FarmAnimal farmAnimal){
        farmAnimal.care();
        farmAnimal.feed();
        farmAnimal.produce();
    }

}
