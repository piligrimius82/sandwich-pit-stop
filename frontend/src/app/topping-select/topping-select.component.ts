import { Component, OnInit } from '@angular/core';
import { OrderService } from '../order-utils/order.service';


@Component({
  selector: 'app-topping-select',
  templateUrl: './topping-select.component.html',
  styleUrls: ['./topping-select.component.css']
})
export class ToppingSelectComponent implements OnInit {

  constructor(private orderService:OrderService) { }

  ngOnInit() {}

  setToppings(topping:string){
    var sandwich = this.orderService.getCurrentSandwich();
    if(topping == "Tomato"){
        sandwich.tomatos = true;
    }
    else if(topping == "Lettuce"){
        sandwich.lettuce = true;
    }
    else if(topping == "Onion"){
        sandwich.onions = true;
    }
    else {}
  }

}
