public class ThreeMethods {
    /*
     Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
     */
    public static void main(String[] args)
    {
        int a =2;
        int b =3;
        int sum=0;
//M1Recurs(a,b,sum);
        //M2();
       // M3();
    }
    //бесконечная рекурсия
    public static int M1Recurs(int a, int b, int sum)
    {
        if (true)
        {
            sum = a + b;
            a++;
            return M1Recurs(a, b, sum);
        }
        return sum;
    }
    // вызов длины у пустой строки
    public static void M2()
    {
        String str =null;
        System.out.println(str.length());
    }
    // Перевод строки в число
    public static void M3()
    {
      String str = "10wew";
      Integer.parseInt(str);
    }

}