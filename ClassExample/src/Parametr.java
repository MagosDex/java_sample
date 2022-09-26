abstract class Parametr {
    static private int count = 1; // счетчик товаров
    private int id; // артикул
    private String name; // название позиции
    private float weight, height, price; // вес, высота, цена


    public Parametr() {
        this("", 0f, 0f, 0f);
    }

    public Parametr(String name, float weight, float height, float price) {
        setId();
        setName(name);
        setWeight(weight);
        setHeight(height);
        setPrice(price);
    }

    public void setId() {
        this.id = count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public float getPrice() {
        return price;
    }

    public static int getCount() {
       return count-1;
    }

    protected void printInfo() {
        System.out.println("Название: " + getName()
                + "\nАртикул товара: " + getId()
                + "\nВес товара: " + getWeight()
                + "\nВысота товара: " + getHeight()
                + "\nЦена товара: " + getPrice() + " руб.");
    }
}
