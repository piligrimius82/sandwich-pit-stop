import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule }    from '@angular/http';

import { AppComponent } from './app.component';

import {AppRoutingModule} from './app-routing.module';
import { OrderComponent } from './order/order.component';
import { OrderProcessingComponent } from './order-processing/order-processing.component';
import { LoginComponent } from './login/login.component';

import {OrderService} from './order-utils/order.service';

@NgModule({
  declarations: [
    AppComponent,
    OrderComponent,
    OrderProcessingComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule
  ],
  providers: [OrderService],
  bootstrap: [AppComponent]
})
export class AppModule { }
