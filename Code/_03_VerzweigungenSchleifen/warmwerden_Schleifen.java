package _03_VerzweigungenSchleifen;

public class warmwerden_Schleifen {
    public static void main(String[] args) {
        for (int i=7; i>0; i=i-2) {
            //Start i=0; solange i<5; i+1
            System.out.println("i ist " + i);
        }
        System.out.println("weiter");

        int i=7;
        while(i>0) {
            System.out.println("i ist " + i);
            i=i-2;
        }
        System.out.println("weiter");

        int a=7;
        do {
            System.out.println("a ist " + a);
            a=a-2;
        } while (a>0);
        System.out.println("weiter");
    }

}
