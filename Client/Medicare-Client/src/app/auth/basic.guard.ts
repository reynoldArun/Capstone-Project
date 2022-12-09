import { AuthServiceService } from './auth-service.service';
import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Route, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BasicGuard implements CanActivate {

  constructor(private auth:AuthServiceService, private router: Router) {}
  canActivate() {
    if(this.auth.isProtected()) {
      alert("you have Already logged in!!")
      this.router.navigate(['/home'])
      return false;
    }
      return true;
  }
    
}
