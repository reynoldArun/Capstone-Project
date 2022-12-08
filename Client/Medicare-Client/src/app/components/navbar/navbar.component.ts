import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private route: Router) { }

  isDisabled:boolean = true
  id:any

  ngOnInit(): void {
    let CheckUrl =  this.route.url === '/account/login' || this.route.url === '/account/register' || this.route.url === '/account/admin'
    if(CheckUrl) {
      this.isDisabled = false;
    }
  }

 

}
