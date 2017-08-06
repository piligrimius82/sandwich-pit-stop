import {Order} from './order';
export class Sandwich {
    sandwichId?:number;
    bread:string;
    substance:string;
    cheese:string;
    tomatos:boolean = false;
    lettuce:boolean = false;
    dressing:string;
    onions:boolean = false;
    comments:string;
    order:Order;
    status:string;
    placedTimestamp:Date;
    completeTimestamp:Date;
    preparerId:number;
    price:number;
}
