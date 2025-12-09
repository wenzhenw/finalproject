import { Component } from '@angular/core';
import { StudentList } from './student-list/student-list';
import { StudentAdd } from './student-add/student-add';

@Component({
  selector: 'app-students',
  imports: [ StudentList, StudentAdd],
  templateUrl: './students.html',
  styleUrl: './students.css',
})
export class Students {

}
