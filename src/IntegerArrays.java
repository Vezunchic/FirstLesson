public class IntegerArrays {
    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
    не равны, необходимо как-то оповестить пользователя.
     */
    public static void main(String[] args) {
        Integer[] m1 = new Integer[]{1,2,5,6};
        Integer[] m2 = new Integer[]{2,3,4,5};
        var result = SubtractionArr(m1,m2);

    }

    public static Integer[] SubtractionArr(Integer[] m1, Integer[] m2) {
        Integer[] sum = new Integer[m1.length];
        if(m1 == null)
        {
            System.err.println("empty array m1");
            return m1;
        }
        if(m2 == null)
        {
            System.err.println("empty array m2");
            return m2;
        }
        if (m1.length != m2.length)
        {
            throw new RuntimeException("массивы не равны");
        }
        for (int i=0; i<sum.length; i++)
        {
        sum [i]= m1[i] - m2[i];
        }
        return sum;
    }
}

