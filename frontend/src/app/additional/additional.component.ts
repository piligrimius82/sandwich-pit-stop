import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';

@Component({
  selector: 'app-additional',
  templateUrl: './additional.component.html',
  styleUrls: ['./additional.component.css']
})
export class AdditionalComponent implements OnInit {

  constructor(private orderService:OrderService) { }

  ngOnInit() { }

  select(additional:boolean) {
    this.orderService.finishSandwich();
    if(additional) {
      this.orderService.additionalSandwich();
    }
  }
}
