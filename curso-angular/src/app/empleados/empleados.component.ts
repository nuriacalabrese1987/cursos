import { Component, OnInit } from '@angular/core';
import { Empleado } from './empleado';

@Component({
  selector: 'empleado',
  templateUrl: './empleados.component.html',
  styleUrls: ['./empleados.component.css']
})
export class EmpleadosComponent implements OnInit {

    public titulo = 'Componente Empleados';
    public empleado!: Empleado;
    public trabajadores!: Array<Empleado>;
    public trabajador_externo!: Boolean;
    public color:string;
    public color_seleccionado:string;

  constructor() {

    this.empleado = new Empleado('Nuria Calabrese', 33, 'Programadora',true);
    this.trabajadores = [
      new Empleado('Nuria Calabrese', 33, 'Programadora',true),
      new Empleado('Manolo Martinez', 25, 'Administrativo',false),
      new Empleado('Victor Lopez', 40, 'Cocinero',true)
    ];
    this.trabajador_externo = true;
    this.color = 'green';
    this.color_seleccionado = '#CCC';
  }

  ngOnInit(){
    console.log(this.trabajadores);
  }

  cambiarExterno(valor: boolean){
    this.trabajador_externo = valor;
  }


}
