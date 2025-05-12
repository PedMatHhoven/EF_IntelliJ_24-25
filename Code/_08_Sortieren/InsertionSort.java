package _08_Sortieren;

public class InsertionSort {
    public static void main(String[] args) {
        int[] s = {23, 7, 5, 13, 11, 2};
        int zusortieren = 0;
        System.out.println(java.util.Arrays.toString(s));
        for (int i = 1; i <= s.length-1; i++) {
            zusortieren = s[i];
            int j = i;
            while(j > 0 && s[j-1] > zusortieren){
                s[j] = s[j-1];
                j--;
            }
            s[j] = zusortieren;
        }
        System.out.println(java.util.Arrays.toString(s));
    }
}
