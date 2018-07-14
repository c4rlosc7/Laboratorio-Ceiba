import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { InmuebleComponent } from './inmueble/inmueble.component';
import { HeaderComponent } from './header/header.component';
import { PrimaComponent } from './prima/prima.component';
import { HomeComponent } from './home/home.component';
import { FormComponent } from './home/form.component';

/*const routes: Routes = [
  {path: '', redirectTo: '/home', pathMatch: 'full'}
];*/

@NgModule({
  declarations: [
    AppComponent,
    UsuarioComponent,
    InmuebleComponent,
    HeaderComponent,
    PrimaComponent,
    HomeComponent,
    FormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule/*,
    RouterModule.forRoot(routes)*/
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
