
public class Main {

    public static void main(String[] args) {

        String[][] strings = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

    sumNumbers(strings);


    }


    static void sumNumbers(String[][] strings) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (strings.length != 4 || strings[0].length != 4)
            throw new MyArraySizeException("Неверный размер входного массива. Надо 4х4");
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Total " + sum);
    }
}







