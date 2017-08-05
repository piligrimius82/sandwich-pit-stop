import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';
import { trigger, state, style, transition, animate } from '@angular/animations';


@Component({
  selector: 'app-condiment-select',
  templateUrl: './condiment-select.component.html',
  styleUrls: ['./condiment-select.component.css'],
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
export class CondimentSelectComponent implements OnInit {

  changeOne: string = 'off';
  changeTwo: string = 'off';
  constructor(private orderService:OrderService) { }

  ngOnInit() {}

  setCondiment(condiment:string){
    if (condiment === "Mayo") {
      this.changeOne = 'on';
      this.changeTwo = 'off'
    }
    else {
      this.changeOne = 'off';
      this.changeTwo = 'on'
    }
    this.orderService.getCurrentSandwich().dressing = condiment;
  }

}
