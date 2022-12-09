import { BasicGuard } from './auth/basic.guard';
import { UserGuard } from './auth/user.guard';
import { ViewproductsComponent } from './components/viewproducts/viewproducts.component';
import { ShowproductsComponent } from './components/showproducts/showproducts.component';
import { AdminDashboardComponent } from './components/admin-dashboard/admin-dashboard.component';
import { NgModule} from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { CartComponent } from './components/cart/cart.component';
import { ShowusersComponent } from './components/showusers/showusers.component';
import { CreateproductComponent } from './components/createproduct/createproduct.component';
import { CreateuserComponent } from './components/createuser/createuser.component';

const routes: Routes = [
  {path: 'home', component:HomeComponent },
  {path: '', redirectTo:'home', pathMatch: 'full'},
  {path: 'account/login', component:LoginComponent, canActivate:[BasicGuard]},
  {path: 'account/register', component:RegisterComponent, canActivate:[BasicGuard]},
  {path: 'account/admin', component:AdminComponent},
  {path: 'admin/dashboard', component:AdminDashboardComponent, canActivate: [UserGuard]},
  {path: 'account/user/cart/:id', component:CartComponent},
  {path: 'admin/dashboard/products', component:ShowproductsComponent, canActivate: [UserGuard]},
  {path: 'admin/dashboard/users', component:ShowusersComponent, canActivate: [UserGuard]},
  {path: 'admin/dashboard/createproducts', component:CreateproductComponent, canActivate: [UserGuard]},
  {path: 'admin/dashboard/createusers', component:CreateuserComponent, canActivate: [UserGuard]},
  {path: 'products', component:ViewproductsComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
