import { Component } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-student-add',
  imports: [ FormsModule ],
  templateUrl: './student-add.html',
  styleUrl: './student-add.css',
})
export class StudentAdd {
	constructor(private studentService: StudentService) { }
	student: Student = {
	  id: 0,
	  name: '',
	  age: 0,
	  snum: 0,
	  campus: '',
	  studyyear: 0
	};
	saveStudent(): void {
	  const data = {
	    //id: this.student.id,
	    name: this.student.name,
	    age: this.student.age,
		snum: this.student.snum,
		campus: this.student.campus,
		year: this.student.studyyear
	  };
	  this.studentService.create(data).subscribe(
	    (data: Student) => this.studentService.onStudentAdded.emit(data)
	  );
	}
}
