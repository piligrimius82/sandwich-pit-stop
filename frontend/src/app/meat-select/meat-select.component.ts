import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';


@Component({
  selector: 'app-meat-select',
  templateUrl: './meat-select.component.html',
  styleUrls: ['./meat-select.component.css']
})
export class MeatSelectComponent implements OnInit {

  constructor(private orderService:OrderService) { }

  ngOnInit() {}

  setMeat(meat:string){
    this.orderService.getCurrentSandwich().substance = meat;
  }
}
