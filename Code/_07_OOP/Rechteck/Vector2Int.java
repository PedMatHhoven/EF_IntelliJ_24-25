package _07_OOP.Rechteck;

public class Vector2Int {
    public int x;
    public int y;

    public Vector2Int(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public void Add(Vector2Int add) {
        x += add.x;
        y += add.y;
    }

    public void Invert() {
        int temp = x;
        x = y;
        y = temp;
    }
}
