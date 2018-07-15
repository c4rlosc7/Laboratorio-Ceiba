import { Component, OnInit } from '@angular/core';
import { Usuario } from './usuario';
import { UsuarioService } from './usuario.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {
  private tituloRegistro: String = 'Formulario registro de usuario';
  private tituloLogin: String = 'Formulario de login';
  private usuario: Usuario = new Usuario();
  private loginUsuario: Usuario = new Usuario();
  private showLogin: Boolean = false;

  constructor(
    private usuarioService: UsuarioService,
    private router: Router,
    private activateRoute: ActivatedRoute
  ) { }

  ngOnInit() {
  }

  /**
   * Método que muestra el formulario de login y oculta el formulario de registro
   */
  public mostrarLogin(): void {
    this.showLogin = true;
  }

  /**
   * Método que registra un usuario
   */
  public register(): void {
    console.log(this.usuario);
  }

  /**
   * Método que realiza la validación del usuario
   */
  public login(): void {
    console.log(this.loginUsuario);
  }

}
