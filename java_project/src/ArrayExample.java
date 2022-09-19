import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int command = -1;
        ArrayClass mainArray = null;

        while (command != 0) {
            System.out.println("----итерактивное меню----");
            if (!ArrayClass.getIsCreate()) {
                System.out.println("1 - Создать массив");
            } else {
                System.out.println("2 - Добавить позицию");
                System.out.println("3 - Удалить позицию");
                System.out.println("4 - Отсортировать");
                System.out.println("5 - Удалить массив");
                System.out.println("6 - Вывести массив в консоль");

            }
            System.out.println("0 - Выход");
            System.out.print("Введите команду: ");
            command = in.nextInt();

            switch (command) {
                case 1: {
                    mainArray = new ArrayClass();
                    break;
                }
                case 2: {
                    mainArray.addValueToArray();
                    break;
                }
                case 3: {
                    mainArray.delElementInArray();
                    break;
                }
                case 4: {
                    System.out.println(mainArray.sortArray());
                    break;
                }
                case 5: {
                    mainArray.destroyArray();
                    break;
                }
                case 6: {
                    mainArray.printArray();
                    break;
                }
            }
        }

    }
}
