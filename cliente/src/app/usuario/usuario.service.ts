import { Injectable } from '@angular/core';
import { Usuario } from './usuario';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private urlEndPoint: string = 'http://localhost:8080/api/';
  private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(private http: HttpClient) { }

  create(usuario: Usuario): Observable<Usuario> {
    return this.http.post<Usuario>(this.urlEndPoint, usuario, { headers: this.httpHeaders });
  }

}
