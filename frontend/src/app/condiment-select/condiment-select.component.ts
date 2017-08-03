import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';

@Component({
  selector: 'app-condiment-select',
  templateUrl: './condiment-select.component.html',
  styleUrls: ['./condiment-select.component.css']
})
export class CondimentSelectComponent implements OnInit {

  constructor(private orderService:OrderService) { }

  ngOnInit() {}

  setCondiment(condiment:string){
    this.orderService.getCurrentSandwich().dressing = condiment;
  }

}
