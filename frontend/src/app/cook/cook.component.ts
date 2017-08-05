import { Component, OnInit } from '@angular/core';

import { Order } from '../entities/order';
import { OrderService } from '../order-utils/order.service';
import { Sandwich } from '../entities/sandwich';
import { SandwichService } from '../order-utils/sandwich.service';

@Component({
  selector: 'cook',
  templateUrl: './cook.html',
  styleUrls: ['./cook.css'],
  providers: [
    OrderService,
    SandwichService
  ]
})


export class CookComponent implements OnInit {
  title = 'Sandwich Pit Stop';
  private activeOrders:Order[];
  private order: Order;
  private sandwiches: Sandwich[];
  
  //private mockOrders: Order[];
  
  
  constructor(private orderService: OrderService, private sandwichService: SandwichService) { }

  ngOnInit() {
    //this.orderService.getOpenOrders().subscribe((activeOrders: Order[]) => this.activeOrders = activeOrders);
  
	//mock test data
	this.activeOrders = [
	{orderId: 100,
	placedTimestamp: new Date(),
	completeTimestamp: null,
    customerName: "Ralph",
    sandwiches: [{sandwichId: 500, bread: "White", substance: "Chicken", cheese: "Swiss", tomatos: false,
		lettuce: true, dressing: "Mustard",onions: false, comments: "la la la", orderId: 12, status: "New Order",
		placedTimestamp: new Date(), completeTimestamp: null, preparerId: 1001, price: 5}]
	},
	{orderId: 101,
	placedTimestamp: new Date(),
	completeTimestamp: null,
    customerName: "Ralph",
    sandwiches: [{sandwichId: 501, bread: "White", substance: "Chicken", cheese: "Swiss", tomatos: false,
		lettuce: true, dressing: "Mustard",onions: false, comments: "la la la", orderId: 12, status: "New Order",
		placedTimestamp: new Date(), completeTimestamp: null, preparerId: 1001, price: 5},
		{sandwichId: 502, bread: "Wheat", substance: "Ham", cheese: "American", tomatos: true,
		lettuce: true, dressing: "Mustard",onions: true, comments: "la la la", orderId: 12, status: "New Order",
		placedTimestamp: new Date(), completeTimestamp: null, preparerId: 1001, price: 5}
		]
	}
  ]
  console.log("OrderId:" + this.activeOrders[0].orderId);

  }
	
 

}