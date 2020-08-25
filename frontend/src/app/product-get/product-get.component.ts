import { Component, OnInit } from '@angular/core';
import Product from '../Product';
import { ProductsService } from '../products.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-get',
  templateUrl: './product-get.component.html',
  styleUrls: ['./product-get.component.css']
})
export class ProductGetComponent implements OnInit {

  products: Product[];
  constructor(private ps: ProductsService, private router: Router) { }

  ngOnInit() {
    this.ps
      .getProducts()
      .subscribe((data: Product[]) => {


        this.products = data;
      });
  }

  // product-get.component.ts

  deleteProduct(id) {
    this.ps.deleteProduct(id).subscribe(res => {
    
      this.ps
      .getProducts()
      .subscribe((data: Product[]) => {


        this.products = data;
      });

    });
  }
}
