import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';
import { trigger, state, style, transition, animate } from '@angular/animations';


@Component({
  selector: 'app-meat-select',
  templateUrl: './meat-select.component.html',
  styleUrls: ['./meat-select.component.css'],
  animations: [
    trigger(
      'selectAnimation', [
        state('off', style({
          backgroundColor: 'fff',
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
export class MeatSelectComponent implements OnInit {

  changeOne: string = 'off';
  changeTwo: string = 'off';
  constructor(private orderService:OrderService) { }

  ngOnInit() {}

  setMeat(meat:string){
    if (meat === "Ham") {
      this.changeOne = (this.changeOne === 'off' ? 'on' : 'off');
    }
    else {
      this.changeTwo = (this.changeTwo === 'off' ? 'on' : 'off');
    }
    this.orderService.getCurrentSandwich().substance = meat;
  }
}
