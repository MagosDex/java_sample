public class Chair extends Parametr {
    private int countLegs; // количество ножек
    private float heightLegs; // высота ножек
    private boolean isHasBack; // наличие спинки

    public Chair(int countLegs, float heightLegs, boolean isHasBack) {
        super();
        setAll(countLegs, heightLegs, isHasBack);
    }

    public Chair(String name, float weight, float height, float price, int countLegs, float heightLegs, boolean isHasBack) {
        super(name, weight, height, price);
        setAll(countLegs, heightLegs, isHasBack);
    }

    private void setAll(int countLegs, float heightLegs, boolean isHasBack) {
        setCountLegs(countLegs);
        setHeightLegs(heightLegs);
        setHasBack(isHasBack);
    }

    public void setCountLegs(int countLegs) {
        this.countLegs = countLegs;
    }

    public void setHeightLegs(float heightLegs) {
        this.heightLegs = heightLegs;
    }

    public void setHasBack(boolean hasBack) {
        isHasBack = hasBack;
    }

    public int getCountLegs() {
        return this.countLegs;
    }

    public float getHeightLegs() {
        return this.heightLegs;
    }

    public boolean isHasBack() {
        return this.isHasBack;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Количество ножек: " + getCountLegs()
                + "\nВысота ножек: " + getHeightLegs()
                + "\nНаличие спинки: " + ((isHasBack()) ? "Имеется" : "Отсутствует"));
    }
}
