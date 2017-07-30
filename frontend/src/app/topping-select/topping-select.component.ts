import { Component, OnInit } from '@angular/core';
import {SandwichService} from '../order-utils/sandwich.service';


@Component({
  selector: 'app-topping-select',
  templateUrl: './topping-select.component.html',
  styleUrls: ['./topping-select.component.css']
})
export class ToppingSelectComponent implements OnInit {

  constructor(private sandwichService: SandwichService) { }

  ngOnInit() {
  }
  setToppings(topping:string){
    this.sandwichService.changeTopping(topping);
  }

}
