import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ProductsService } from '../products.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {

  angForm: FormGroup;
  constructor(private fb: FormBuilder, private ps: ProductsService,private  router:Router) {
    this.createForm();
  }

  createForm() {
    this.angForm = this.fb.group({
      name: ['', Validators.required],
      category: ['', Validators.required],
      price: ['', Validators.required]
    });
  }

  addProduct(name, price, category) {


    console.log(name)
    this.ps.addProduct(name, category, price);
   
    this.angForm.patchValue({
       
      name:[ null],
      category:[null],
      price: [null]
    })
   // this.router.navigate(['products/add']);
  }






  ngOnInit() {
  }

}
