import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { OrderComponent } from './order/order.component';
import { OrderProcessingComponent } from './order-processing/order-processing.component';
import { LoginComponent } from './login/login.component'

const routes: Routes = [
  {path:'', redirectTo: '/order',pathMatch: 'full'},
  { path: 'order', component: OrderComponent },
  { path: 'order-processing', component: OrderProcessingComponent },
  { path: 'login', component: LoginComponent }  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
