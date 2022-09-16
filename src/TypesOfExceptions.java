public class TypesOfExceptions
{
    public static void main(String[] args)
    {
        String[][] arr = new String[][]{
                {"1","2","3","4","5"},
                {"5","2","3","2"}};

        sum2d(arr);
    }
    /*
    Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    */

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    /*
    Исключение :
     1. если занчение в массиве не число, parseInt выдаст исключение
     2. если в массиве присутсвует null
     3. если в строке массива меньше 5 чисел
     */
}
