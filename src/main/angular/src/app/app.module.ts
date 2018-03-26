import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppService} from "./app.service";
import {HttpModule} from "@angular/http";

import {AppComponent} from './app.component';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpModule
  ],
  providers: [
    AppService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
