package practice_5v.botanicGarden;



public class Cactus extends Plant implements Careble{
    private int lengthSpikes;

    public Cactus(String species, int lengthSpikes){
        super("Кактус");
        this.lengthSpikes = lengthSpikes;
    }

    public int getLengthSpikes() {
        return lengthSpikes;
    }

    public void setLengthSpikes(int lengthSpikes) {
        this.lengthSpikes = lengthSpikes;
    }

    @Override
    public void care() {
        super.care();
        System.out.println(" свет и редкий полив.");
    }
}
