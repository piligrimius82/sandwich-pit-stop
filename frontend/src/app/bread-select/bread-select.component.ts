import { Component, OnInit} from '@angular/core';
import { OrderService } from '../order-utils/order.service';
import { trigger, state, style, transition, animate } from '@angular/animations';

@Component({
  selector: 'app-bread-select',
  templateUrl: './bread-select.component.html',
  styleUrls: ['./bread-select.component.css'],
  providers: [],
  animations: [
    trigger(
      'selectAnimation', [
        state('off', style({
          backgroundColor: '#fff',
          transform: 'scale(1)'
        })
        ),
        state('on', style({
          backgroundColor: '#dcdcdc',
          transform: 'scale(0.95)'
        })
        ),
        transition('off <=> on', animate('100ms ease-out'))
      ]
    )
  ]
})
export class BreadSelectComponent implements OnInit {
  changeOne: string = 'off';
  changeTwo: string = 'off';

  constructor(private orderService: OrderService) { }

  ngOnInit() { }

  setBread(bread: string) {
   if (bread.indexOf("Wheat")<0) {
      this.changeOne = 'on';
      this.changeTwo = 'off'
    }
    else {
      this.changeOne = 'off';
      this.changeTwo = 'on'
    }
    this.orderService.getCurrentSandwich().bread = bread;
  }

}
