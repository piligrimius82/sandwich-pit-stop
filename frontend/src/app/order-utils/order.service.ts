import { Injectable } from '@angular/core';
import { Http, Headers } from '@angular/http';

import { Observable }     from 'rxjs/Observable';
import 'rxjs/add/operator/map';

import { Order } from '../entities/order';

@Injectable()
export class OrderService {

    private ordersUrl = 'api/order-processing';
    private openOrders:Order[];

    constructor(private http: Http) { }

    getOpenOrders(): Observable<Order[]> {
        return this.http.get(this.ordersUrl)
            .map(response => <Order[]>response.json());
    }
}