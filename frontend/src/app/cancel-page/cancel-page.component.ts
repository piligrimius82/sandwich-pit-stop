import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cancel-page',
  templateUrl: './cancel-page.component.html',
  styleUrls: ['./cancel-page.component.css']
})
export class CancelPageComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
    setTimeout((router:Router) => {
      this.router.navigate(['']);
    }, 5000);
  }

}
