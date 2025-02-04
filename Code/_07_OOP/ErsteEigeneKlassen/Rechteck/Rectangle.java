package _07_OOP.ErsteEigeneKlassen.Rechteck;

public class Rectangle {
    public Vector2Int size;
    public char character = '#';
    public boolean checkered;
    public char checkeredChar;

    public Rectangle(Vector2Int _size, char _character, boolean _checkered, char _checkeredChar) {
        size = _size;
        character = _character;
        checkered = _checkered;
        checkeredChar = _checkeredChar;
    }

    // Simplerer constructor, wenn man nur die Größe angeben will
    public Rectangle(Vector2Int _size) {
        size = _size;
    }

    // Vertauscht Breite mit Höhe und die beiden Character
    public void Invert() {
        size.Invert();
        char tempChar = character;
        character = checkeredChar;
        checkeredChar = tempChar;
    }

    public String ToString() {
        String str = "";
        for (int y = 0; y < size.y; y++) {
            for (int x = 0; x < size.x * 2; x++) {// Breite mal 2, weil zwischen den Zeilen Lücken sind
                if (checkered && (x + y) % 2 != 0) { // Fürs Schachbrettmuster
                    str += checkeredChar;
                    continue;
                }
                str += character;
            }
            str += "\n";
        }
        return str;
    }
}