import { Sandwich} from "../entities/sandwich";
import { Injectable } from '@angular/core';

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
    private orderId: number = 0;
    private status: string;
    private placedTimestamp: Date;
    private completeTimestamp: Date;
    private preparerId: number;
    private price: number;
    
    private sandwichService: SandwichService;

    constructor(){
        this.tomatos = false;
        this.lettuce = false;
        this.onions = false;
    }
    

    public changeBread(bread: string){
        this.bread = bread;
        this.price = 3.00;
        this.orderId = this.orderId + 1;
        console.log("Bread changed "+ this.bread);
        console.log("Price changed "+ this.price);
        console.log("orderId changed" + this.orderId);
    }

    public changeSubstance(meat: string){
        this.substance = meat;

        console.log("Meat changed "+ this.substance);
    }

    public changeCheese(cheese:string){
        this.cheese = cheese;
        console.log("Cheese changed "+this.cheese);
    }

    public changeTopping(topping: string){
        if(topping =="tomato"){
            this.tomatos = true;
            console.log("Topping changed "+ topping+ "to "+ this.valueOf);
        }
        else if(topping == "lettuce"){
            this.lettuce = true;
            console.log("Topping changed "+ topping+"to "+ this.valueOf);
        }
         else if(topping == "onion"){
            this.onions = true;
            console.log("Topping changed "+ topping+"to "+ this.valueOf);
        }
        else {}
        
    }
    
    public changeDressing(condiment: string){
        this.dressing = condiment;
        console.log("Condiment changed "+this.dressing);
    }

    getBread(){
        return this.bread;
    }

    getMeat(){
        return this.substance;
    }

    getCheese(){
        return this.cheese;
    }
}

