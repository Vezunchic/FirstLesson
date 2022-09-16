public class DivisionArray {
    public static void main(String[] args) {
        Integer[] m1 = new Integer[]{null,6,5,6};
        Integer[] m2 = new Integer[]{2,3,4,2};
        var result = SubtractionArr(m1,m2);
System.out.println();
    }

    public static Integer[] SubtractionArr(Integer[] m1, Integer[] m2) {

        Integer[] sum = new Integer[m1.length];
        if(m1 == null)
        {
            System.err.println("empty array m1");
            return null;
        }
        if(m2 == null)
        {
            System.err.println("empty array m2");
            return null;
        }
        if (m1.length != m2.length)
        {
            throw new RuntimeException("массивы не равны");
        }

        for (int i=0; i<sum.length; i++)
        {
            if(m1[i] == null || m2[i]==null )
            {
                throw new RuntimeException("значение в массиве равно null");
            }
            if(m2[i] == 0)
            {
                throw new RuntimeException("Знаменатель равен 0, деление на 0");
            }
            sum [i]= m1[i]/m2[i];
        }
        return sum;
    }
}
