    public class MyArrayDataException extends RuntimeException {
        int i, j;

        public MyArrayDataException(int i, int j) {
            super("В ячейке с координатами:" + "[" + (i + 1) + "][" + (j + 1) + "]" + "указано не число!");
            this.i = i;
            this.j = j;
        }

    }
