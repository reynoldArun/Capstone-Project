import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http: HttpClient) { }


  // (micro service - cors error need to fix it)
  public CreateUser(user:any) {
    return this.http.post("http://localhost:9001/add", user, {responseType: 'text' as 'json'})
  }

  public GetAllUser() {
    return this.http.get<any>("http://localhost:8080/user/all")
  }

  public DeleteUser() {

  }

  public GetUserById() {

  }
}
