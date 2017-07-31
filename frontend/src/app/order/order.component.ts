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

  private orderArray: any[];
  private json: string;
  bread: string;

  output: any[];
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

  constructor(private sandwichService: SandwichService) { }

  ngOnInit() {
    this.getMyBread();
    this.createJson();
      // console.log(JSON.parse(JSON.stringify(this.sandwichService.getSandwich())));
  }

  getMyBread(){
    this.bread = this.sandwichService.getBread();
    return this.sandwichService.getBread();
  }

  createJson(){
    this.json = JSON.stringify(this.sandwichService);
    this.output = Array.of(JSON.parse(this.json));
    console.log(this.output);
  }

}
