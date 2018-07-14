import { Component, OnInit } from '@angular/core';
import { Inmueble } from './inmueble';


@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  private tituloRegistro: String = 'Formulario de registro inmueble';
  private inmueble: Inmueble = new Inmueble();
  tipos: [
    { id: 1, descripcion: 'Apartamento' },
    { id: 2, descripcion: 'Casa' },
    { id: 3, descripcion: 'Local' }
  ];

  constructor() { }

  ngOnInit() {
  }

}
