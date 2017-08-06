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
  private sandwich: Sandwich;
  
  //alert message
  private message= '';
  
  constructor(private orderService: OrderService, private sandwichService: SandwichService) { }

  ngOnInit() {
		this.orderService.getOpenOrders().subscribe((activeOrders: Order[]) => this.activeOrders = activeOrders);

  
  }
	prepareSandwich(sandwich:Sandwich){
		sandwich.status = "Preparing";
		console.log(sandwich.sandwichId + ", " + sandwich.status);
		this.sandwichService.updateSandwich(sandwich).subscribe(s=>sandwich);
	}
	
	cancelSandwich(sandwich:Sandwich){
		//sandwich.status="Cancel";
		//console.log(sandwich.sandwichId + ", " + sandwich.status);
		if(confirm("Are you sure you want to cancel?") == true){
			sandwich.status="Cancel";
			this.sandwichService.updateSandwich(sandwich).subscribe(s=>sandwich);
			}
	}
	
	completeSandwich(sandwich:Sandwich){
		if(confirm("Sandwich is complete?") == true){
			sandwich.status="Complete";
			this.sandwichService.updateSandwich(sandwich).subscribe(s=>sandwich);
			}
	}
 

}