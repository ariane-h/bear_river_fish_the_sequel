import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> fish;

    public River(){
        this.fish = new ArrayList<Salmon>();
    }

    public int fishCount() {
        return this.fish.size();
    }

    public void addSalmon(Salmon salmon) {
        this.fish.add(salmon);
    }

    public Salmon removeSalmon() {
        return this.fish.remove(0);
    }
}
