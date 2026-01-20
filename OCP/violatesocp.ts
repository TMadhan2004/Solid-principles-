class Classifier {
    number: number;
    name: string;
    playertype: string;

    constructor(number: number, name: string, playertype: string) {
        this.number = number;
        this.name = name;
        this.playertype = playertype;
    }

    getPlayerType(): void {
        if (this.playertype === "offspinner") {
            console.log(`${this.name} is a cricketer`);
        } 
        else if (this.playertype === "legspinner") {
            console.log(`${this.name} is a cricketer`);
        } 
        else if (this.playertype === "Keeper") {
            console.log(`${this.name} is a cricketer`);
        } 
        else if (this.playertype === "defender") {
            console.log(`${this.name} is a footballer`);
        } 
        else if (this.playertype === "goalkeeper") {
            console.log(`${this.name} is a footballer`);
        }
    }
}

// Main execution
const player1 = new Classifier(100, "xyz", "offspinner");
player1.getPlayerType();

const player2 = new Classifier(102, "abc", "legspinner");
player2.getPlayerType();
