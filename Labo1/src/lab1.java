public class lab1 {
    public static void main (String [] args) {
        // 1. Создать одномерный массив a типа long. Заполнить его числами от 5 до 16 включительно в порядке возрастания.
        long[] a = new long[12];
        int counter = 0;
        for (int i = 5; i <= 16; i++) {
            a[counter] = i;
            counter++;
        }
        // 2. Создать одномерный массив x типа float. Заполнить его 17-ю случайными числами в диапазоне от -6.0 до 14.0.
        float[] x = new float[17];
        float min = -6.0f, max = 14.0f;
        for (int i = 0; i < 17; i++) {
            x[i] = (float) (min + (Math.random() * (max - min)));
            System.out.println(i);
            System.out.println(x[i]);
        }
        // 3. Создать двумерный массив a размером 12x17. Вычислить его элементы по следующей формуле (где x = x[j]):
        // (...)
        double[][] A = new double[12][17];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 17; j++) {
                if (a[i] == 12) {
                    A[i][j] = Math.tan(Math.cos(Math.cbrt(x[j])));
                } else if (a[i] == 6 || a[i] == 7 || a[i] == 10 || a[i] == 11 || a[i] == 15 || a[i] == 16) {
                    A[i][j] = Math.pow(Math.E, Math.pow(((Math.pow(x[j], ((x[j])/0.5))) / (1 - (Math.pow(((2/3f) - (x[j])), 2)))), 2));
                } else {
                    A[i][j] = Math.pow(Math.E, Math.pow(Math.E, (Math.sin(Math.pow(((x[j])/(2+(x[j]))), 3)))));
                }
            }
        }
        // 4. Напечатать полученный в результате массив в формате с пятью знаками после запятой.
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.printf("%.5f" + " ", A[i][j]);
                System.out.println(" ");
            }
//            System.out.println(" ");
        }
    }
}