public class Vagon{
    private String id;
    private int gruz;
    private int lydi;

    public Vagon(String id, int gruz, int lydi) {
        this.id = id;
        this.gruz = gruz;
        this.lydi = lydi;;
    }

    public String getId() {
        return id;
    }

    public int getgruz() {
        return gruz;
    }

    public int getlydi() {
        return lydi;
    }
}