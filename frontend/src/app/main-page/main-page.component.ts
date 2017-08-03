import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {

  constructor(private orderService: OrderService) {
  }

  ngOnInit() {
  }

}
