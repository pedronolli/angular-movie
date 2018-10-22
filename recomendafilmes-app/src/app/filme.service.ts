import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Filme } from './filme/filme';
import { HttpClient } from 'selenium-webdriver/http';

const URL: string = "http://10.11.22.175:8080/";

@Injectable({
  providedIn: 'root'
})
export class FilmeService {

  constructor(private http : HttpClient) { }


  getFilmes() : Observable<Filme[]>{
    return this.http.get<Filme[]>(URL);
  }
}
