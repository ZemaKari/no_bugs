package practice_5v.botanicGarden;

public class Plant implements Careble {
    private String species;

    public Plant(String species){
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    @Override
    public void care() {
        System.out.print(this.species);
    }
}
