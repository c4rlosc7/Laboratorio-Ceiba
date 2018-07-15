import { Injectable } from '@angular/core';
import { Inmueble } from './inmueble';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class InmuebleService {

  private urlEndPoint: string = 'http://localhost:8080/laboratorio/inmueble';
  private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(private http: HttpClient) { }

  create(inmueble: Inmueble): Observable<Inmueble> {
    return this.http.post<Inmueble>(this.urlEndPoint, inmueble, { headers: this.httpHeaders });
  }

}
