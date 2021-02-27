import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router'


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  message: any
  isLoadign: any

  constructor(private router: Router) { }

  ngOnInit() {
  }

  onSubmit(form: NgForm){

  }

}
