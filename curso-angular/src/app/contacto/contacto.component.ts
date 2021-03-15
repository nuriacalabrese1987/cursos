import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'contacto',
  templateUrl: './contacto.component.html',
  styleUrls: ['./contacto.component.css']
})
export class ContactoComponent implements OnInit {

public titulo = 'Pagina de contacto de la web';
public parametro: any;
  constructor(
    private _route:ActivatedRoute,
    private _router: Router
  ) { }

  ngOnInit(): void {
    this._route.params.forEach((params: Params) =>{  //params es el array que ha recogido los parametros pasados por URL
      this.parametro = params['page']; //page es el nombre que he asignado a los parametros en el router
    });
  }

}
