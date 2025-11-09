package practice_5v.museum;

public  class Exhibit implements Discribe, Preserve  {
    private String name;

    public Exhibit(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void discribe() {

    }

    @Override
    public void preserve() {

    }
}
