import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { UserServiceService } from 'src/app/Services/user-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userEmail:any = ''
  userPassword:any = ''
  error:any;

  constructor(private Service: UserServiceService, private router: Router) { }

  ngOnInit(): void {
  }

  Login() {
    this.Service.GetAllUser().subscribe(res => {
      res.forEach((person:any) => {
        if(this.userEmail == person.email && this.userPassword == person.password) {
          localStorage.setItem('token', 'usertoken')
          localStorage.setItem('id', person.id)
          this.router.navigate(['/home'])
        } else {
          this.error = true
          setTimeout(() => {
            this.error = false
            this.userEmail = ''
            this.userPassword = ''
          }, 3000)
        }
      });
    })
  }

  
}
