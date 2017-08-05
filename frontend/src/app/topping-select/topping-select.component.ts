import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';
import { trigger, state, style, transition, animate } from '@angular/animations';


@Component({
  selector: 'app-topping-select',
  templateUrl: './topping-select.component.html',
  styleUrls: ['./topping-select.component.css'],
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
export class ToppingSelectComponent implements OnInit {

  changeOne: string = 'off';
  changeTwo: string = 'off';
  changeThree: string = 'off';
  changeFour: string = 'off';

  constructor(private orderService: OrderService) { }

  ngOnInit() { }

  setToppings(topping: string) {
    if (topping === "Lettuce") {
      this.changeOne = (this.changeOne === 'off' ? 'on' : 'off');
      this.changeFour = 'off';
    }
    else if (topping === "Tomato") {
      this.changeTwo = (this.changeTwo === 'off' ? 'on' : 'off');
      this.changeFour = 'off';
    }
    else if (topping === "Onion") {
      this.changeThree = (this.changeThree === 'off' ? 'on' : 'off');
      this.changeFour = 'off';
    }
    else {
      this.changeFour = (this.changeFour === 'off' ? 'on' : 'off');
      this.changeOne ='off';
      this.changeTwo ='off';
      this.changeThree ='off';
    }

    var sandwich = this.orderService.getCurrentSandwich();

    if (topping == "Tomato") {
      sandwich.tomatos = true;
    }
    else if (topping == "Lettuce") {
      sandwich.lettuce = true;
    }
    else if (topping == "Onion") {
      sandwich.onions = true;
    }
    else { }
  }

}
