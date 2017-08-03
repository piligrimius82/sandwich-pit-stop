import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';

@Component({
  selector: 'app-cheese-select',
  templateUrl: './cheese-select.component.html',
  styleUrls: ['./cheese-select.component.css']
})
export class CheeseSelectComponent implements OnInit {

  constructor(private orderService:OrderService) { }

  ngOnInit() {}

  setCheese(cheese:string){
    this.orderService.getCurrentSandwich().cheese = cheese;
  }

}
