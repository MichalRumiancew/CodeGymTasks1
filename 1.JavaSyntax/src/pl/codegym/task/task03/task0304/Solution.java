package pl.codegym.task.task03.task0304;

/* 
Zadanie z procentami
*/

public class Solution {
    public static double dodajDziesiecProcent(int i) {
        return i + (i*0.10);
    }

    public static void main(String[] args) {
        System.out.println(dodajDziesiecProcent(9));
    }
}
