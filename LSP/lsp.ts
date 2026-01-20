interface Shape {
    calculateArea(): void;
}

class Rectangle implements Shape {
    protected height: number;
    protected width: number;

    constructor() {
        this.height = 0;
        this.width = 0;
    }

    setHeight(h: number): void {
        this.height = h;
    }

    setWidth(w: number): void {
        this.width = w;
    }

    calculateArea(): void {
        console.log("The area of the rectangle is " + this.width * this.height);
    }
}

class Square implements Shape {
    protected side: number;

    constructor() {
        this.side = 0;
    }

    setSide(s: number): void {
        this.side = s;
    }

    calculateArea(): void {
        console.log("The area of square is " + this.side * this.side);
    }
}

const object1 = new Square();
object1.setSide(2);
object1.calculateArea();
const object2 = new Rectangle();
object2.setHeight(2);
object2.setWidth(10);
object2.calculateArea();


