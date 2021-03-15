import { ModuleWithProviders } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { FrutaComponent } from './fruta/fruta.component';
import { EmpleadosComponent } from './empleados/empleados.component';

const appRoutes: Routes = [
  {path: '', component: EmpleadosComponent},
  {path: 'fruta', component: FrutaComponent},
  {path: 'empleados', component: EmpleadosComponent},
  {path: '**', component: EmpleadosComponent}
];
 export const AppRoutingProviders: any[] =[];

 export const routing: ModuleWithProviders<any> = RouterModule.forRoot(appRoutes);
