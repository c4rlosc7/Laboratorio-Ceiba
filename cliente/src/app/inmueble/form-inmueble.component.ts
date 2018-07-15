import { Component, OnInit } from '@angular/core';
import { Inmueble } from './inmueble';
import { EnumTipos } from './enum-tipos';
import { Usuario } from '../usuario/usuario';
import { InmuebleService } from './inmueble.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-form-inmueble',
  templateUrl: './form-inmueble.component.html'
})
export class FormInmuebleComponent implements OnInit {

  private tituloRegistro: String = 'Formulario de registro inmueble';
  private inmueble: Inmueble = new Inmueble();
  private usuarioLog: Usuario = new Usuario();
  tipos: EnumTipos[] = [
    { id: 1, descripcion: 'Apartamento' },
    { id: 2, descripcion: 'Casa' },
    { id: 3, descripcion: 'Local' }
  ];

  constructor(
    private inmuebleService: InmuebleService,
    private router: Router,
    private activateRoute: ActivatedRoute
  ) { }

  ngOnInit() {
  }

  /**
   * Método
   */
  public crear(): void {
    this.usuarioLog = JSON.parse(sessionStorage.getItem('usuarioLogin'));
    this.inmueble.usuario = this.usuarioLog;
    let prima: number = (this.inmueble.valorInmueble * 0.05) / 12 + ((this.inmueble.valorInmueble * 0.05) / 12) * 0.0001;
    this.inmueble.valorPrima = prima;
    this.inmuebleService.create(this.inmueble)
      .subscribe(inmueble => {
        this.router.navigate(['/inmueble-det']);
        console.log(inmueble, prima);
        alert('Exitoso');
      });
  }

}
