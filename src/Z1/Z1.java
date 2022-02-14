package Z1;

import java.time.LocalTime;

public class Z1 {

    public static <T extends Comparable<T>> boolean jestPalindromem (T[] tablica){
        for (int i = 0; i < tablica.length / 2; i++){
            if (tablica[i].compareTo(tablica[tablica.length - 1 - i]) < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] testInt= new Integer[5];
        testInt[0] = 1;
        testInt[1] = 2;
        testInt[2] = 3;
        testInt[3] = 2;
        testInt[4] = 1;

        LocalTime[] testLT = new LocalTime[5];
        testLT[0] = LocalTime.of(11, 30);
        testLT[1] = LocalTime.of(12, 30);
        testLT[2] = LocalTime.of(13, 30);
        testLT[3] = LocalTime.of(14, 30);
        testLT[4] = LocalTime.of(15, 30);
        System.out.println(jestPalindromem(testInt));
        System.out.println(jestPalindromem(testLT));

    }
}
