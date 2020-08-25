import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  uri = 'http://localhost:8080/books';

  constructor(private http: HttpClient){

  }
  addProduct(name, category, price) {
    console.log(name, category, price);
    const obj = {
      category,
      name,
      price
    };
    
    return this.http.post(`${this.uri}/save`, obj)
      .subscribe(res => console.log('Done'));
  }

  getProducts() {
    return this
      .http
      .get(`${this.uri}/all`);
  }

  editProduct(id) {
    return this
      .http
      .get(`${this.uri}/by/${id}`);
  }

  updateProduct(name, category, price, id) {

    const obj = {
      id,
      category,
      name,
      price

    };

    this
      .http
      .put(`${this.uri}/update/`, obj)
      .subscribe(res =>
        console.log('Update Complete')

      );

  }


  deleteProduct(id) {
    return this
      .http
      .delete(`${this.uri}/delete/${id}`);

  }
}
