import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductsService } from '../products.service';
import { CompileShallowModuleMetadata } from '@angular/compiler';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {

  angForm: FormGroup;
  product: any = {};


  constructor(private route: ActivatedRoute, private router: Router, private ps: ProductsService, private fb: FormBuilder) {
    this.createForm();
  }

  createForm() {
    this.angForm = this.fb.group({
      name: ['', Validators.required],
      price: ['', Validators.required],
      category: ['', Validators.required]
    });
  }

  check() {
    this.route.params.subscribe(params => {
      this.ps.editProduct(params.id).subscribe(res => {

        this.product = res;

      });
    });
  }

  check2(id) {
    this.route.params.subscribe(params => {
      this.ps.editProduct(params.id).subscribe(res => {
        this.product = res;


      });
    });
  }

  ngOnInit() {
    this.check();


  }

  updateProduct(name, category, price, id) {

    console.log(id)
    this.check2(id);


    if (this.product != null) {

      this.route.params.subscribe(params => {
        this.ps.updateProduct(name, category, price, params.id);




        this.router.navigate(['products']);
      });
    }
    else {

      console.log("Already have !")
    }
  }


}
