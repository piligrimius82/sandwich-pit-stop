import {Sandwich} from './sandwich'

export class Order {
    orderId?:number;
    placedTimestamp:Date;
    completeTimestamp:Date;
    customerName:string;
    sandwiches:Sandwich[] = [];
}
