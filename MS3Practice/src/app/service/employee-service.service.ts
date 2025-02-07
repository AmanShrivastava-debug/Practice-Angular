// ng g service service/EmployeeServ

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';
import { Employee } from '../model/employee-records';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private apiUrl = "http://localhost:3000/post"; 

  constructor(private http: HttpClient) {}

  getEmployees(): Observable<any> {
    return this.http.get(`${this.apiUrl}/employee`);
  }

  getEmployee(id: any): Observable<any[]> {
    return this.http.get(`${this.apiUrl}/employee/${id}`).pipe(
      map((data: any) => {
        // If the response is an array, return it as is
        if (Array.isArray(data)) {
          return data;
        } else {
          // If the response is a single object, wrap it in an array
          return [data];
        } 
      })
    );
  }

  addEmployees(employee: Employee): Observable<any> {
    return this.http.post(`${this.apiUrl}/employee`, employee);
  }
}