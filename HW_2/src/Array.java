import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import static java.lang.Integer.parseInt;

public class Array {

    static int size = 4;                           // задаем размерность массива (меняем для проверки первого исключения)

    public static String[][] arrayCreation(){      // метод создания массива размером size

        String [] charList = {"1", "2", "3", "4", "5", "A"};   // строковый список цифр и одной буквы
        Random rand = new Random();

        String[][] array = new String[size][size];

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                array[i][j] = charList[rand.nextInt(6)];
            }
        }
        return array;
    }

    public static int convertSumm (String[][] array) throws MyArraySizeException, MyArrayDataException {      //метод конвертации элементов массива из строкового значения в числовое и их суммирование

        if(array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) throw new MyArraySizeException("Массив должен иметь размерность 4х4!"); // условие проверяет размерность массива и бросает исключение

        int summ = 0;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                try {                                         // пробуем преобразовать строковый элемент в числовой и складываем
                    summ += parseInt(array[i][j]);
                } catch (NumberFormatException ex){           // ловим стандартное NFE
                    throw new MyArrayDataException("Массив должен содержать только числовые значения!", i+1, j+1);     // выбрасываем свое исключение
                }
            }
        }
        return summ;
    }

    public static void main(String[] args) {

        int a=0;      // инициализируем переменную для суммы чисел массива

        String[][] array = arrayCreation();   // создаем массив array с помощью метода arrayCreation

        for(int i=0; i<array.length; i++){       // выводим созданный массив в консоль
            for(int j=0; j<array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        try {                                                // вызываем метод convertSumm и обрабатываем оба исключения
            a = Array.convertSumm(array);
            System.out.println("Сумма элементов массива равна: " + a);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            ex.printStackTrace();
        }
    }
}
