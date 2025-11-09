package practice_5v.botanicGarden;

public class Orchid extends  Plant{
    private int quantityFlowers;

    public Orchid(String species, int quantityFlowers){
        super(species);
        this.quantityFlowers = quantityFlowers;
    }

    public int getQuantityFlowers() {
        return quantityFlowers;
    }

    public void setQuantityFlowers(int quantityFlowers) {
        this.quantityFlowers = quantityFlowers;
    }

    @Override
    public void care() {
        super.care();
        System.out.println(" влажность и тень.");
    }
}
