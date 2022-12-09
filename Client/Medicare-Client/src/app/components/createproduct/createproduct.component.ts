import { Component, OnInit } from '@angular/core';
import { Product } from 'src/Model/Product';

@Component({
  selector: 'app-createproduct',
  templateUrl: './createproduct.component.html',
  styleUrls: ['./createproduct.component.css']
})
export class CreateproductComponent implements OnInit {

  product: Product = new Product()

  constructor() { }

  ngOnInit(): void {
  }

  CreateProduct() {

  }

}
