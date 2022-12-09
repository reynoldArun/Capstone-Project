import { Component, OnInit } from '@angular/core';
import { User } from 'src/Model/User';

@Component({
  selector: 'app-createuser',
  templateUrl: './createuser.component.html',
  styleUrls: ['./createuser.component.css']
})
export class CreateuserComponent implements OnInit {

  user: User = new User()

  constructor() { }

  ngOnInit(): void {
  }

  CreateUser() {

  }

}
