import { Component, OnInit } from '@angular/core';
import { Order } from '../entities/order';
import { OrderService } from '../order-utils/order.service';
import { Sandwich} from "../entities/sandwich";



@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})

export class OrderComponent implements OnInit {

  private currentOrder:Order;

  constructor(private orderService:OrderService) { }

  ngOnInit() {
    this.currentOrder = this.orderService.getCurrentOrder();
  }

  submitOrder() {
    this.orderService.saveOrder().subscribe(
      (response) => {
        console.log(response)
        this.orderService.cancelOrder();
        // TODO order success view
      },
      (error) => {
        console.log(error)
        // TODO handle current order
      }
    );
  }
}
