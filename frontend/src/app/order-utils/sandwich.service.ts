export class SandwichService {

    private sandwichId?: number;
    private bread: string;
    private substance: string;
    private cheese: string;
    private tomatos: boolean;
    private lettuce: boolean;
    private dressing: string;
    private onions: boolean;
    private comments: string;
    private orderId: number;
    private status: string;
    private placedTimestamp: Date;
    private completeTimestamp: Date;
    private preparerId: number;
    private price: number;

    constructor(){
        this.tomatos = false;
        this.lettuce = false;
        this.onions = false;
    }
    

    public changeBread(bread: string){
        this.bread = bread;
        console.log("Bread changed "+bread);
    }

    public changeSubstance(meat: string){
        this.substance = meat;
        console.log("Meat changed "+meat);
    }

    public changeCheese(cheese:string){
        this.cheese = cheese;
        console.log("Cheese changed "+cheese);
    }

    public changeTopping(topping: string){
        if(topping =="tomato"){
            this.tomatos = true;
            console.log("Topping changed "+ topping+ "to "+ this.tomatos.valueOf);
        }
        else if(topping == "lettuce"){
            this.lettuce = true;
            console.log("Topping changed "+ topping+"to "+ this.lettuce.valueOf);
        }
         else if(topping == "onion"){
            this.onions = true;
            console.log("Topping changed "+ topping+"to "+ this.onions.valueOf);
        }
        else {}
        
    }
    
    public changeDressing(condiment: string){
        this.dressing = condiment;
        console.log("Condiment changed "+condiment);
    }

}

