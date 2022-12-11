import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  constructor(private http: HttpClient) { }

  public GetAllProducts() {
    return this.http.get<any>("http://localhost:8080/product/all")
  }

  //(mircro service cors error)
  public DeleteProduct(id:any) {
    return this.http.delete("http://localhost:9002/delete/"+id, {responseType: 'text' as 'json'})
  }

  public createProduct(medicine:any) {
    return this.http.post("http://localhost:9002/add", medicine, {responseType: 'text' as 'json'})
  }

}
