import { Component } from '@angular/core';
import { OrderService } from './order-utils/order.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  constructor(private orderService:OrderService) { }

  ngOnInit() {}

  cancelClicked() {
    this.orderService.cancelOrder();
  }

  isOrdering() {
    return this.orderService.getCurrentOrder() != null;
  }
}
