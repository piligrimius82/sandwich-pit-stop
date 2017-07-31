import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

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

/**
 * list of routes (pages) for the application
 */
const appRoutes: Routes =[
{path: '', component: MainPageComponent},
{path: 'bread', component: BreadSelectComponent},
{path: 'meat', component: MeatSelectComponent},
{path: 'cheese', component: CheeseSelectComponent},
{path: 'topping', component: ToppingSelectComponent},
{path: 'condiment', component: CondimentSelectComponent},
{path: 'order-cancelled', component: CancelPageComponent},
{path: 'add', component: AdditionalComponent},
{path: 'login', component: LoginComponent},
{path: 'order-processing', component: OrderProcessingComponent},
{path: 'order', component: OrderComponent},


/** Placeholders to connect Ishmael's components */
/** {path: 'summary', component: OrderSummaryComponent}, */
/** {path: 'succuess', component: OrderSuccessfulComponent}, */

];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
