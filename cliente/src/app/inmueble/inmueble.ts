import { Usuario } from '../usuario/usuario';

export class Inmueble {
    id: number;
    direccion: string;
    tipo: number;
    valorInmueble: number;
    metraje: number;
    estrato: number;
    fechaCreacion: string;
    fechaModificacion: string;
    usuario: Usuario;

}
