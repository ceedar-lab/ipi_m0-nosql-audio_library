import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Album } from '../model/Album';

@Injectable({ providedIn: 'root' })
export class DataService {

  constructor(
    private httpClient: HttpClient
  ) {
    this.getAlbumsRequest()    
  }

  getAlbumsRequest() {
    return this.httpClient.get('http://localhost:8081/albums')
  }

}