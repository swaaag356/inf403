package lab12.model;

public class Passenger {
    private String name;

    public Passenger(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
