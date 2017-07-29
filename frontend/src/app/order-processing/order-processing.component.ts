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
  private date:Date = new Date();
  
  private sandwich: Sandwich = 
  {
    bread: "White",
    substance: "Chicken",
    cheese: "Swiss",
    tomatos: false,
    lettuce: true,
    dressing: "Mustard",
    onions: false,
    comments: "string",
    orderId: 12,
    status: "New Order",
    placedTimestamp: this.date,
    completeTimestamp: this.date,
    preparerId: 1001,
    price: 36
  }
  

    private myOrder: Order =
    {
      placedTimestamp: this.date,
      completeTimestamp: null,
      customerName: "Dudeness",
      sandwiches: [this.sandwich,this.sandwich]
  }
  
  

  constructor(private orderService: OrderService) { 
  }


  ngOnInit() {
    this.orderService.getOpenOrders().subscribe(res=> this.openOrders = res);
    // this.orderService.saveOrder(this.myOrder).subscribe(
    //   (response) => console.log(response),
    //   (error) => console.log
    // );
  }


}
