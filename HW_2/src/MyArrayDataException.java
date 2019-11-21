public class MyArrayDataException extends Exception {

    public MyArrayDataException(String msg, int i, int j){
        super(msg);
        System.out.println("Строка: " + i + ", столбец: " + j);
    }
}
