import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';
import {Order} from '../entities/order';
import{Sandwich} from '../entities/sandwich';

@Component({
  selector: 'app-order-processing',
  templateUrl: './order-processing.component.html',
  styleUrls: ['./order-processing.component.css'],
  providers: [OrderService]
})
  
export class OrderProcessingComponent implements OnInit {

  private openOrders:Order[];
  private date:Date;
  
  private sandwich: Sandwich[] = [
  {
    sandwichId: 1,
    bread: "string",
    substance: "string",
    cheese: "string",
    tomatos: false,
    lettuce: true,
    dressing: "string",
    onions: false,
    comments: "string",
    orderId: 12,
    status: "string",
    placedTimestamp: this.date,
    completeTimestamp: this.date,
    preparerId: 1001,
    price: 36
  }
  ]

    private myOrder: Order[] =[
    {
      orderId: 678,
      placedTimestamp: this.date,
      completeTimestamp: this.date,
      customerName: "string",
      sandwiches: this.sandwich
  }
  ]
  

  constructor(private orderService: OrderService) { 
  }


  ngOnInit() {
    this.orderService.getOpenOrders().subscribe(res=> this.openOrders = res);
    this.orderService.saveOrders(this.myOrder).subscribe(
      (response) => console.log(response),
      (error) => console.log
    );
  }


}
