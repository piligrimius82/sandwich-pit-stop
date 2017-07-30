import { Component, OnInit } from '@angular/core';
import {SandwichService} from '../order-utils/sandwich.service';

@Component({
  selector: 'app-cheese-select',
  templateUrl: './cheese-select.component.html',
  styleUrls: ['./cheese-select.component.css']
})
export class CheeseSelectComponent implements OnInit {

  constructor(private sandwichService: SandwichService) { }

  ngOnInit() {
  }

  setCheese(cheese: string){
    this.sandwichService.changeCheese(cheese);
  }

}
