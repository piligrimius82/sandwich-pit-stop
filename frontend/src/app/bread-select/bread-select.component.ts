import { Component, OnInit } from '@angular/core';
import {MdCardModule} from '@angular/material';
import {SandwichService} from '../order-utils/sandwich.service';
import { Sandwich} from "../entities/sandwich";


@Component({
  selector: 'app-bread-select',
  templateUrl: './bread-select.component.html',
  styleUrls: ['./bread-select.component.css'],
  providers: []
})
export class BreadSelectComponent implements OnInit {

  constructor(private sandwichService: SandwichService) { }

  ngOnInit() {
  }

  setBread(bread: string){
    this.sandwichService.changeBread(bread);
  }

}
