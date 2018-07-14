import { Component, OnInit } from '@angular/core';
import { Inmueble } from './inmueble';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  private tituloRegistro: String = 'Formulario de registro inmueble';
  private inmueble: Inmueble;

  constructor() { }

  ngOnInit() {
  }

}
