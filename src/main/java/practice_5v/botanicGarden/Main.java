package practice_5v.botanicGarden;

public class Main {
    public static void main(String[] args) {
        Plant orchid = new Orchid("Фаленонопсис", 5);
        Plant cactus = new Cactus("Опунция", 10);
        BotanicGarden  garden = new BotanicGarden();
        garden.maintain(cactus);
        garden.maintain(orchid);
    }
}
