import { NgModule } from '@angular/core';
import { FilmeComponent } from './filme/filme.component';
import { Routes, RouterModule } from '@angular/router';


const routes : Routes = [
  {path:"", component: FilmeComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule {

 }
