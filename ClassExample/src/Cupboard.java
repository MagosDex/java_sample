public class Cupboard extends Parametr {
    private String aPenMaterial; // материал ручек
    private int countSash, countLockers; // число створок, шкафчиков

    public Cupboard(String aPenMaterial, int countSash, int countLockers) {
        super();
        setAll(aPenMaterial, countSash, countLockers);
    }

    public Cupboard(String name, float weight, float height, float price, String aPenMaterial, int countSash, int countLockers) {
        super(name, weight, height, price);
        setAll(aPenMaterial, countSash, countLockers);
    }

    private void setAll(String aPenMaterial, int countSash, int countLockers) {
        setAPenMaterial(aPenMaterial);
        setCountSash(countSash);
        setCountLockers(countLockers);
    }

    public String getaPenMaterial() {
        return this.aPenMaterial;
    }

    public void setAPenMaterial(String aPenMaterial) {
        this.aPenMaterial = aPenMaterial;
    }

    public int getCountSash() {
        return this.countSash;
    }

    public void setCountSash(int countSash) {
        this.countSash = countSash;
    }

    public int getCountLockers() {
        return this.countLockers;
    }

    public void setCountLockers(int countLockers) {
        this.countLockers = countLockers;
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Материал ручек: " + getaPenMaterial()
                + "\nКол-во створок: " + getCountSash()
                + "\nКол-во шкафчиков: " + getCountLockers());
    }
}
