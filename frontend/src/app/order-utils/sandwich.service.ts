import { Sandwich } from "../entities/sandwich";
import { Injectable } from '@angular/core';

export class SandwichService {

  private sandwich: Sandwich;

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
      this.sandwich = new Sandwich();
      this.sandwich.tomatos = false;
      this.sandwich.lettuce = false;
      this.sandwich.onions = false;
      this.sandwich.price = 3.00;
    }

    public changeBread(bread: string){
        this.sandwich.bread = bread;
    }

    public changeSubstance(meat: string){
        this.sandwich.substance = meat;
    }

    public changeCheese(cheese:string){
        this.sandwich.cheese = cheese;
    }

    public changeTopping(topping: string){
        if(topping == "Tomato"){
            this.sandwich.tomatos = true;
        }
        else if(topping == "Lettuce"){
            this.sandwich.lettuce = true;
        }
         else if(topping == "Onion"){
            this.sandwich.onions = true;
        }
        else {}
    }

    public changeDressing(condiment: string){
        this.sandwich.dressing = condiment;
    }

    public getSandwich(){
        return this.sandwich;
    }
}
