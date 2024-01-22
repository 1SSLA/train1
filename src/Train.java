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

    public void addVagon(Vagon vagon) {
        int gruzLimit = 5000;
        if (vagon.getgruz() <= gruzLimit) {
            Vagons.add(vagon);
        } else {
            System.out.println("Превышен лимит груза в вагоне!!!");
        }
    }

    public int calculateTotalGruz() {
        int totalGruz = 0;
        int gruzLimit = 5000;

        for (Locomotive locomotive : locomotives) {
            totalGruz += locomotive.getgruz();
            if (locomotive.getgruz() > 0 && totalGruz >= gruzLimit) {
                System.out.println("Превышен лимит груза на поезде!!!");
            }
        }

        for (Vagon vagon : Vagons) {
            totalGruz += vagon.getgruz();
            if (vagon.getgruz() > gruzLimit) {
                System.out.println("Превышен лимит груза в вагоне!!!");
            }
        }
        return totalGruz;
    }

    public int calculateTotallydi() {
        int totallydi = 0;
        for (Vagon vagon : Vagons) {
            totallydi += vagon.getlydi();
        }
        return totallydi;
    }
}
