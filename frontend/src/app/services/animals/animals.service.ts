import { Injectable } from '@angular/core';
import { Animal } from '../../models/animal';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AnimalsService {
  private apiResource = 'animals'

  constructor(private httpClient: HttpClient) {}

  public getAll(): Observable<Animal[]> {
    return this.httpClient.get<Animal[]>(
      `${environment.apiUrl}/${this.apiResource}`
    );
  }

  public getOne(id: number): Observable<Animal | undefined> {
    return this.httpClient.get<Animal>(
      `${environment.apiUrl}/${this.apiResource}/${id}`
    )
  }
}
