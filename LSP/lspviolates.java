class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setHeight(int h) {
        height = h;
    }

    @Override
    public void setWidth(int w) {
        width = w;
    }
}

public class lspviolates {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setHeight(4);
        System.out.println("Rectangle area: " + rect.getArea());

        Square sq = new Square();
        sq.setWidth(6);
        sq.setHeight(6);
        System.out.println("Square area: " + sq.getArea());
    }
}
