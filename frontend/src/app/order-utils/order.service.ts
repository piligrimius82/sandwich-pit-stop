import { Injectable, Input } from '@angular/core';
import { Http, Headers } from '@angular/http';
import{Sandwich} from '../entities/sandwich';
import { Order } from '../entities/order';

import { Observable }     from 'rxjs/Observable';
import 'rxjs/add/operator/map';



@Injectable()
export class OrderService {

    private ordersUrl = 'api/order-processing';
    private openOrders:Order[];
    public myOrder =new Array<Order>();

    constructor(private http: Http) {

     }

    getOpenOrders(): Observable<Order[]> {
        return this.http.get(this.ordersUrl)
            .map(response => <Order[]>response.json());
    }

    saveOrder(order:Order){
        console.log("Posting to: '" + this.ordersUrl + "' with value: " + JSON.stringify(order));
        return this.http.post(this.ordersUrl, order);
    }
}
