import { Component } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student-list',
  imports: [],
  templateUrl: './student-list.html',
  styleUrl: './student-list.css',
})


export class StudentList {
	students: Student[] = [];
	constructor(private studentService: StudentService) { }
	
	ngOnInit(): void {
		this.getStudents();
		this.studentService.onStudentAdded.subscribe(
			(data: Student) => this.students.push(data)
		);
	}
	getStudents(): void {
	  this.studentService.getAll().subscribe({
	    next: (data) => {
	      this.students = data;
	    }
	  });
	}
}
