/**Core Angular Functionality imports */
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule }    from '@angular/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MdButtonModule, MdToolbarModule, MdCardModule} from '@angular/material';
import {Routes, RouterModule} from '@angular/router';

/** Routing Imports */
import {AppRoutingModule} from './app-routing.module';

/** Component Imports */
import { AppComponent } from './app.component';
import { OrderComponent } from './order/order.component';
import { OrderProcessingComponent } from './order-processing/order-processing.component';
import { LoginComponent } from './login/login.component';
import { MainPageComponent } from './main-page/main-page.component';
import { BreadSelectComponent } from './bread-select/bread-select.component';
import { MeatSelectComponent } from './meat-select/meat-select.component';
import { CheeseSelectComponent } from './cheese-select/cheese-select.component';
import { ToppingSelectComponent } from './topping-select/topping-select.component';
import { CondimentSelectComponent } from './condiment-select/condiment-select.component';
import { CancelPageComponent } from './cancel-page/cancel-page.component';
import { AdditionalComponent } from './additional/additional.component';
/** Placeholders to connect Ishmael's components */
/** import { OrderSummaryComponent} from './order-summary/order-summary.component'; */
/** import { OrderSucessfulComponent} from './order-success/order-success.component'; */

import {OrderService} from './order-utils/order.service';


@NgModule({
  declarations: [
    AppComponent,
    MainPageComponent,
    BreadSelectComponent,
    MeatSelectComponent,
    CheeseSelectComponent,
    CondimentSelectComponent,
    ToppingSelectComponent,
    LoginComponent,
    OrderComponent,
    AdditionalComponent,
    CancelPageComponent,
    OrderProcessingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    BrowserAnimationsModule,
    MdButtonModule,
    MdToolbarModule,
    MdCardModule,
    RouterModule
    ],
  providers: [OrderService],
  bootstrap: [AppComponent]
})
export class AppModule { }
