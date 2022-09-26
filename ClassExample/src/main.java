public class main {
    /*
    Имеется родительский класс (артикул, название позиции,  вес, высота, цена)
     Дочерний класс стулья (количество ножек, высота ножек, наличие спинки)
     Дочерний класс шкафы (материал ручек, число створок, число шкафчиков)
     */
    public static void main(String[] args) {
        Chair chair1 = new Chair("Классический стул",
                3.5f,
                120,
                4500,
                4,
                80,
                true);
        Chair chair2 = new Chair(4, 50f, false);
        Cupboard cup1 = new Cupboard("Широкий-дубовый",
                40,
                210,
                12500,
                "пластик",
                2,
                4);
        chair2.setName("Табурет");
        chair1.printInfo();
        System.out.println("");
        chair2.printInfo();
        System.out.println("");
        cup1.printInfo();

        System.out.println("Всего товаров: " + Parametr.getCount());

    }
}
