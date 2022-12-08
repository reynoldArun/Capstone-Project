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
  userId:any

  ngOnInit(): void {
    this.userId = localStorage.getItem('id')
    let CheckUrl =  this.route.url === '/account/login' || this.route.url === '/account/register' || this.route.url === '/account/admin'
    if(CheckUrl) {
      this.isDisabled = false;
    }
  }

  Cart() {
    let checkToken = localStorage.getItem('token')
    if(checkToken === 'admintoken') {
      alert("Not Allowed")
    } else if(checkToken === null) {
      alert("Please login as user")
      this.route.navigate(['/account/login'])
    } else if(checkToken === 'usertoken') {
      this.route.navigate(['account/user/cart', this.userId])
    }
  }

}
