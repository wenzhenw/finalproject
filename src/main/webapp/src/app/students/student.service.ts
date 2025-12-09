import { EventEmitter, Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Student } from "./student";

const restUrl = '/api/v1/students';

@Injectable({
  providedIn: 'root',
})
export class StudentService {
	onStudentAdded = new EventEmitter<Student>();
	constructor(private http: HttpClient) { }
	getAll(): Observable<Student[]> {
	    return this.http.get<Student[]>(restUrl);
	}
	create(data: any): Observable<any> {
	  return this.http.post(restUrl, data);
	}
}
