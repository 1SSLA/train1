import java.util.ArrayList;
import java.util.List;

public class Train {
    private String name;
    private List<Locomotive> locomotives;
    private List<Vagon> Vagons;

    public Train(String name) {
        this.name = name;
        this.locomotives = new ArrayList<>();
        this.Vagons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addLocomotive(Locomotive locomotive) {
        locomotives.add(locomotive);
    }

    public void addVagon(Vagon Vagon) {
        Vagons.add(Vagon);
    }

    public int calculateTotalgruz() {
        int totalgruz = 0;
        for (Locomotive locomotive : locomotives) {
            totalgruz += locomotive.getgruz();
        }
        for (Vagon vagon : Vagons) {
            totalgruz += vagon.getgruz();
        }
        return totalgruz;
    }

    public int calculateTotallydi() {
        int totallydi = 0;
        for (Vagon vagon : Vagons) {
            totallydi += vagon.getlydi();
        }
        return totallydi;
    }
}
