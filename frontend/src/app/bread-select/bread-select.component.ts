import { Component, OnInit } from '@angular/core';
import { MdCardModule } from '@angular/material';
import { OrderService } from '../order-utils/order.service';

@Component({
  selector: 'app-bread-select',
  templateUrl: './bread-select.component.html',
  styleUrls: ['./bread-select.component.css'],
  providers: []
})
export class BreadSelectComponent implements OnInit {

  constructor(private orderService:OrderService) { }

  ngOnInit() {}

  setBread(bread:string){
    this.orderService.getCurrentSandwich().bread = bread;
  }
}
