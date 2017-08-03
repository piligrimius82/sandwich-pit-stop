import { Injectable, Input } from '@angular/core';
import { Http, Headers } from '@angular/http';
import { Sandwich } from '../entities/sandwich';
import { Order } from '../entities/order';

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Injectable()
export class OrderService {
    private ordersUrl = 'api/order-processing';
    private currentOrder:Order;
    private currentSandwich:Sandwich;

    constructor(private http:Http) {
    }

    startNewOrder() {
      this.currentOrder = new Order();
      this.currentOrder.customerName = "Customer " + (new Date).getTime();

      this.currentSandwich = new Sandwich();
    }

    cancelOrder() {
      this.currentOrder = null;
      this.currentSandwich = null;
    }

    finishSandwich() {
      this.currentOrder.sandwiches.push(this.currentSandwich);
      this.currentSandwich = null;
    }

    additionalSandwich() {
      this.currentSandwich = new Sandwich();
    }

    getOpenOrders():Observable<Order[]> {
      return this.http.get(this.ordersUrl)
        .map(response => <Order[]>response.json());
    }

    saveOrder() {
      this.currentOrder.placedTimestamp = new Date;
      this.currentOrder.sandwiches.forEach(sandwich => {
        sandwich.placedTimestamp = new Date;
      });

      return this.http.post(this.ordersUrl, this.currentOrder);
    }

    // Getters
    getCurrentSandwich():Sandwich {
      return this.currentSandwich;
    }

    getCurrentOrder():Order {
      return this.currentOrder;
    }
}
