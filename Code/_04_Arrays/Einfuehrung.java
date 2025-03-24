package _04_Arrays;

public class Einfuehrung {
    public static void main(String[] args) {
        System.out.println("Erstes Beispiel zur Nutzung von (Integer-)Arrays.");
        int a; int b; int c; int d,e,f; //einzelne Variablen (wie bisher)
        int[] MeinErsterArray = new int[10]; //neu: Liste/ Tabelle/ "Feld" von (10) Zahlen (- noch ohne konkrete Werte)
        int[] ZweiterArray = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100}; //Feld mit konkreten Werten

        System.out.print("So haben wir bisher Variablen festgelegt und ausgegeben:");
        a = -11; b = -9; c = -7; d = -5; e = -3; f = -1;
        System.out.print(" " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " ");
        System.out.println(".");

        System.out.println("Nun folgt im Prinzip dasselbe mithilfe so genannter Arrays :).");
        MeinErsterArray[0] = a; MeinErsterArray[1] = b; MeinErsterArray[2] = c;
        MeinErsterArray[3] = d; MeinErsterArray[4] = e; MeinErsterArray[5] = f;
        System.out.print("MeinErsterArray: ");
        for(int i=0; i<=5; i++) System.out.print(MeinErsterArray[i] + " ");

        System.out.print("/ ZweiterArray: ");
        for(int i=0; i<=9; i++) System.out.print(ZweiterArray[i] + " ");
        System.out.println(".");

        System.out.print("Jetzt ändern wir mal unseren ersten Array: ");
        for(int i=0; i<=5; i++) MeinErsterArray[i]= 2*i + 1;
        for(int i=0; i<=5; i++) System.out.print(MeinErsterArray[i] + " ");
        System.out.println(".");

        System.out.println("Zweidimensionale Arrays funktionieren im Prinzip genauso:");
        int[][] DritterArray = new int[3][4];
        for(int i=0; i<=2; i++)
            for(int j=0; j<=3; j++)
                DritterArray[i][j]=i*j;
        for(int i=0; i<=2; i++) {
            for(int j=0; j<=3; j++)
                System.out.print(DritterArray[i][j] + " ");
            System.out.println();
        }
    }
}
