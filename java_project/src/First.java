import java.util.Scanner;
import java.util.Random;

public class First {
    public static void main(String[] args) {
        int[] mainArray = null;
        int command = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----итерактивное меню----");
            if (mainArray == null) {
                System.out.println("1 - Создать массив");
            } else if (mainArray.length > 0) {
                System.out.println("2 - Добавить позицию");
                System.out.println("3 - Удалить позицию");
                System.out.println("4 - Отсортировать");
                System.out.println("5 - Удалить массив");
            }
            System.out.println("0 - Выход");
            System.out.print("Введите команду: ");
            command = scanner.nextInt();
            if (command == 1) {
                mainArray = createArray();
                printArray(mainArray);
            } else if (command == 2) {
                System.out.print("Ведите новый элемент массива: ");
                int newValue = scanner.nextInt();
                int[] newArray = new int[mainArray.length + 1];
                for (int i = 0; i < newArray.length; i++) {
                    if (i < mainArray.length) {
                        newArray[i] = mainArray[i];
                    } else {
                        newArray[i] = newValue;
                    }
                }
                mainArray = newArray;
                newArray = null;
                printArray(mainArray);
            } else if (command == 3) {
                while (true) {
                    System.out.print("Ведите номер элемента для удаления(индексы с 1): ");
                    int delIndex = scanner.nextInt();
                    if (delIndex <= mainArray.length) {
                        int[] tempArray = new int[mainArray.length - 1];
                        int j = 0;
                        for (int i = 0; i <=tempArray.length-1; i++) {
                            if (i == delIndex) {
                                j++;
                            }
                            tempArray[i] = mainArray[j];
                            j++;

                        }
                        mainArray=tempArray;
                        break;
                    } else {
                        System.out.println("Такого индекса не существует, всего " + mainArray.length + " позиций");
                    }
                }
                printArray(mainArray);

            } else if (command == 4) {
                mainArray = sortArray(mainArray);
                printArray(mainArray);
            } else if (command == 5) {
                mainArray = null;
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Комманда не поддерживается");
            }
        }
    }

    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите разрядность массива: ");
        int count = scanner.nextInt();
        System.out.print("Заполнить автоматически? (1 - да / 2 - нет): ");
        int autoFilling = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            if (autoFilling == 1) {
                array[i] = random.nextInt(10);
            } else {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

        }
        return array;
    }

    public static void printArray(int tmpArray[]) {
        System.out.print("Массив: [");
        for (int i = 0; i < tmpArray.length; i++) {
            System.out.print(tmpArray[i]);
            if (i == tmpArray.length - 1) {
                System.out.println("]");
            } else {
                System.out.print(", ");
            }
        }
    }

    public static int[] sortArray(int tmpArray[]) {
        int count = 0;
        while (true) {
            int max = -1;
            for (int i = 0; i < tmpArray.length - 1; i++) {
                if (tmpArray[i] > tmpArray[i + 1]) {
                    max = tmpArray[i];
                    tmpArray[i] = tmpArray[i + 1];
                    tmpArray[i + 1] = max;
                }
            }
            count++;
            if (max == -1) {
                break;
            }
        }
        System.out.println("Для сортировки потребовалось " + (count - 1) + " итерации");
        return tmpArray;
    }
}
