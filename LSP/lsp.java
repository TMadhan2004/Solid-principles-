interface shape{
    void calculateArea();
}

class Rectangle implements shape{
    protected int height;
    protected int width;

    public void setHeight(int h){
        this.height = h;
    }

    public void setWidth(int w){
        this.width = w;
    }

    public void calculateArea(){
        System.out.println("The area of the rectangle is "+width*height);
    }

}

class Square implements shape{
    protected int side;

    public void setSide(int s){
        this.side = s;
    }

    public void calculateArea(){
        System.out.println("The area of square is "+side*side);
    }
}

public class lsp{
    public static void main(String args[]){
        Square object1 = new Square();
        object1.setSide(2);
        object1.calculateArea();
        Rectangle object2 = new Rectangle();
        object2.setHeight(2);
        object2.setWidth(10);
        object2.calculateArea();
    }
}