import { AdminDashboardComponent } from './components/admin-dashboard/admin-dashboard.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './components/admin/admin.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { CartComponent } from './components/cart/cart.component';

const routes: Routes = [
  {path: 'home', component:HomeComponent },
  {path: '', redirectTo:'home', pathMatch: 'full'},
  {path: 'account/login', component:LoginComponent},
  {path: 'account/register', component:RegisterComponent},
  {path: 'account/admin', component:AdminComponent},
  {path: 'admin/dashboard', component:AdminDashboardComponent},
  {path: 'account/admin/cart', component:CartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
