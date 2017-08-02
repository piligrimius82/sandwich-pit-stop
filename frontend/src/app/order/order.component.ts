import { Component, OnInit } from '@angular/core';
import {Order} from '../entities/order';
import { OrderService } from '../order-utils/order.service';
import { SandwichService } from '../order-utils/sandwich.service';
import { Sandwich} from "../entities/sandwich";



@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})

export class OrderComponent implements OnInit {

  constructor(private sandwichService: SandwichService, private orderService: OrderService) { }

  ngOnInit() {
    var sandwich = this.sandwichService.getSandwich();
    sandwich.placedTimestamp = new Date();

    var order = new Order();
    order.placedTimestamp = new Date();
    order.customerName = "Customer X";
    order.sandwiches = [sandwich];

    // console.log(JSON.stringify(order));
    this.orderService.saveOrder(order).subscribe(
        (response) => console.log(response),
        (error) => console.log(error)
    );
  }

}
