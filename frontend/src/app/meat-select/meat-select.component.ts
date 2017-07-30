import { Component, OnInit } from '@angular/core';
import {SandwichService} from '../order-utils/sandwich.service';


@Component({
  selector: 'app-meat-select',
  templateUrl: './meat-select.component.html',
  styleUrls: ['./meat-select.component.css']
})
export class MeatSelectComponent implements OnInit {

  constructor(private sandwichService: SandwichService) { }

  ngOnInit() {
  }

  setMeat(meat: string){
    this.sandwichService.changeSubstance(meat);
  }
}
