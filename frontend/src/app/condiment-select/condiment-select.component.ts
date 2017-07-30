import { Component, OnInit } from '@angular/core';
import {SandwichService} from '../order-utils/sandwich.service';

@Component({
  selector: 'app-condiment-select',
  templateUrl: './condiment-select.component.html',
  styleUrls: ['./condiment-select.component.css']
})
export class CondimentSelectComponent implements OnInit {

  constructor(private sandwichService: SandwichService) { }

  ngOnInit() {
  }

  setCondiment(condiment: string){
    this.sandwichService.changeDressing(condiment)
  }

}
