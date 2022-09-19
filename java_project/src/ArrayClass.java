import java.util.Random;
import java.util.Scanner;

public class ArrayClass extends ArrayExample {
    private int[] array;
    private int amount;
    private static Boolean isCreate = false;

    public ArrayClass() {
        amount = getIntValue("Введите разрядность массива: ");
        array = new int[amount];
        createArray(amount);
    } // Конструктор класса

    private void createArray(int amount) {
        Random random = new Random();
        int autoFilling = getIntValue("Заполнить автоматически? (1 - да / 2 - нет): ");
        for (int i = 0; i < amount; i++) {
            this.array[i] = (autoFilling == 1)
                    ? random.nextInt(10)
                    : getIntValue("Введите элемент " + (i + 1) + ": ");
        }
        setIsCreate();
    }  // Метод создания Массива

    private void setIsCreate() {
        isCreate = !isCreate;
    } //Метод установки создания/удаления массива класса

    public static Boolean getIsCreate() {
        return isCreate;
    }  // Метод возвращения статуса массива

    public void printArray() {
        if (isCreate) {
            System.out.print("Массив: [");
            int k = 0, size = this.array.length;
            for (Integer i : this.array) {
                System.out.print(" " + i);
                if (++k == size) System.out.println(" ]");
                else System.out.print(", ");
            }
        } else System.out.println("Массив не создан");
    } // Метод вывода массива в консоль

    private void addValueToArray(int newValue) {
        int[] newArray = new int[this.array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (i < this.array.length) ? this.array[i] : newValue;
        }
        this.array = newArray;


    } // Метод добавления нового элемента в массив

    public void addValueToArray() {
        this.addValueToArray(getIntValue("Ведите новый элемент массива: "));
    } // Перегрузка метода добавления нового элемента

    private void delElementInArray(int indexToDel) {
        if (indexToDel < this.array.length) {
            indexToDel -= 1;
            int[] tempArray = new int[this.array.length - 1];
            int j = 0;
            for (int i = 0; i <= tempArray.length - 1; i++) {
                if (i == indexToDel) {
                    j++;
                }
                tempArray[i] = this.array[j];
                j++;
            }
            this.array = tempArray;
        } else if (indexToDel == this.array.length) {
            destroyArray();
        } else {
            System.out.println("Такого индекса не существует, всего " + this.array.length + " позиций");
        }
    } //Метод удаления элемента из массива

    public void delElementInArray() {
        delElementInArray(getIntValue("Ведите индекс элемента для удаления из массива(индексы с 1): "));
    } // Перегрузка метода удаления элемента из массива

    public void destroyArray() {
        this.array = null;
        setIsCreate();
    } // Метод удаления массива

    public String sortArray() {
        int sortArrayBy = getIntValue("Произвести сортировку в массиве? (1 - по возр. / 2 - по убыв.) : ");
        int count = 0;
        count = (sortArrayBy == 1) ? sortArrayByABC() : sortArrayByCBA();

        return "Для сортировки потребовалось " + (count - 1) + " итерации";
    } // Метод сортировки массива

    private int sortArrayByABC() {
        int count = 0;
        while (true) {
            int max = -1;
            for (int i = 0; i < this.array.length - 1; i++) {
                if (this.array[i] > this.array[i + 1]) {
                    max = this.array[i];
                    this.array[i] = this.array[i + 1];
                    this.array[i + 1] = max;
                }
            }
            count++;
            if (max == -1) {
                break;
            }
        }
        return count;
    } // сортировка по возрастанию

    private int sortArrayByCBA() {
        int count = 0;
        while (true) {
            int max = -1;
            for (int i = 0; i < this.array.length - 1; i++) {
                if (this.array[i] < this.array[i + 1]) {
                    max = this.array[i];
                    this.array[i] = this.array[i + 1];
                    this.array[i + 1] = max;
                }
            }
            count++;
            if (max == -1) {
                break;
            }
        }
        return count;
    } // сортировка по убыванию

    private int getIntValue(String printMessage) {
        Scanner in = new Scanner(System.in);
        System.out.print(printMessage);
        int value = in.nextInt();
        //in.close();
        return value;
    } // Метод запроса целого числа с клавиатуры
}
