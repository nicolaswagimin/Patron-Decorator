import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { AvatarBuilderComponent } from './components/avatar-builder/avatar-builder.component'; // <-- IMPORTARLO AQUÍ

@NgModule({
  declarations: [
    AppComponent,
    AvatarBuilderComponent // <-- AÑADIRLO AQUÍ
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
