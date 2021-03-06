import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { InmuebleComponent } from './inmueble/inmueble.component';
import { HeaderComponent } from './header/header.component';
import { PrimaComponent } from './prima/prima.component';
import { FormComponent } from './usuario/form.component';
import { UsuarioService } from './usuario/usuario.service';
import { FormInmuebleComponent } from './inmueble/form-inmueble.component';

const routes: Routes = [
  {path: '', redirectTo: '/home', pathMatch: 'full'},
  {path: 'usuario', component: FormComponent},
  {path: 'inmueble', component: FormInmuebleComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    UsuarioComponent,
    InmuebleComponent,
    HeaderComponent,
    PrimaComponent,
    FormComponent,
    FormInmuebleComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [UsuarioService],
  bootstrap: [AppComponent]
})
export class AppModule { }
