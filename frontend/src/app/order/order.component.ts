import { Component, OnInit } from '@angular/core';
import {Order} from '../entities/order';
import { OrderService } from '../order-utils/order.service';


@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  private orderArray: any[];


  //An example file json array of an order
  people: any[] = [
    {
      'orderId': '1',
      'sandwich': [
        {
          "meat": "Chicken",
          "cheese": "Cheddar",
          "price": "$3.00"
        }
      ]
    },
  ];

  constructor(private orderService: OrderService) { }

  ngOnInit() {
      this.orderService.getOpenOrders().subscribe(res=> this.orderArray = res);
  }

}
