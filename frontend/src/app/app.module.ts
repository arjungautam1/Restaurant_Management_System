import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FoodListComponent } from './food-list/food-list.component';
import { CreateFoodComponent } from './create-food/create-food.component';
import { CreateOrderComponent } from './create-order/create-order.component';
import { OrderListComponent } from './order-list/order-list.component';
import { PaymentComponent } from './payment/payment.component';
import { PaymentListComponent } from './payment-list/payment-list.component';

@NgModule({
  declarations: [
    AppComponent,
    FoodListComponent,
    CreateFoodComponent,
    CreateOrderComponent,
    OrderListComponent,
    PaymentComponent,
    PaymentListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
