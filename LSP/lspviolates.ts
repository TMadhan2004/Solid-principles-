class Rectangle {
    protected width: number;
    protected height: number;

    constructor() {
        this.width = 0;
        this.height = 0;
    }

    setWidth(w: number): void {
        this.width = w;
    }

    setHeight(h: number): void {
        this.height = h;
    }

    getArea(): number {
        return this.width * this.height;
    }
}

class Square extends Rectangle {
    override setHeight(h: number): void {
        this.height = h;
    }

    override setWidth(w: number): void {
        this.width = w;
    }
}

const rect = new Rectangle();
rect.setWidth(5);
rect.setHeight(4);
console.log("Rectangle area:", rect.getArea());
const sq = new Square();
sq.setWidth(6);
sq.setHeight(6);
console.log("Square area:", sq.getArea());

