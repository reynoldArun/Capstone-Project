import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor() { }

  isAdminLoggedIn() {
    return localStorage.getItem('atoken')
  }

  isUserLoggedIn() {
    return localStorage.getItem('token')
  }

  isProtected() {
    return localStorage.getItem('token')
  }

}
