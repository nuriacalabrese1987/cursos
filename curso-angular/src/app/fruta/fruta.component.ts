import { Component } from '@angular/core';



@Component({
  selector: 'fruta',
  templateUrl:'./fruta.component.html'
})
export class FrutaComponent {


  public nombre_componente = 'Componente de fruta ';
  public listado_frutas: string = 'Pera, naranja, sandia';
  //si quiero meter en mi array cualquier tipo de dato lo declaro como any
  public nombre:string;
  public edad:number;
  public mayorEdad:boolean;
  public trabajos:Array<string> = ['carpintero', 'albañil']
  public trabajos2:Array<any> = ['carpintero', 'albañil', 33]

  constructor(){
  this.nombre = 'nuria calabrese';
  this.edad = 33;
  this.mayorEdad = true;

  }

  ngOnInit(){

      this.cambiarNombre(this.nombre);
      this.cambiarEdad(this.edad);
      // alert('hola mundo '+this.nombre+' '+this.edad);

      //variables y alcances

      var uno = 8;
      var dos = 15;

      if(uno == 8){
        let uno = 3;
        var dos = 88;
        //aqui dara 3 y 88
        console.log('dentro del if '+uno+ ' '+ dos);
      }
      //aqui dara 8 y 88
      console.log('fuera del if '+uno+' '+dos)
  }

  cambiarNombre(nombre: string){
    this.nombre = nombre+' y concateno'

  }
  cambiarEdad(edad:number){
    this.edad=77;
  }

}
