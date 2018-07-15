import { Component, OnInit } from '@angular/core';
import { Inmueble } from './inmueble';
import { EnumTipos } from './enum-tipos';

@Component({
  selector: 'app-form-inmueble',
  templateUrl: './form-inmueble.component.html'
})
export class FormInmuebleComponent implements OnInit {

  private tituloRegistro: String = 'Formulario de registro inmueble';
  private inmueble: Inmueble = new Inmueble();
  tipos: EnumTipos[] = [
    { id: 1, descripcion: 'Apartamento' },
    { id: 2, descripcion: 'Casa' },
    { id: 3, descripcion: 'Local' }
  ];

  constructor() { }

  ngOnInit() {
  }

  /**
   * Método
   */
  public crear(): void {
    console.log(this.inmueble);
  }

}
