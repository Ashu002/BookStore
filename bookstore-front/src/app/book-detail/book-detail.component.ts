import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'bs-book-detail',
  templateUrl: './book-detail.component.html',
  styles: []
})
export class BookDetailComponent implements OnInit {

  book = {
    id: 1,
    title: "Dummy Title",
    description: "Dummy Description",
    unitCost: "123",
    isbn: "123-456-7891",
    nbOfPages: "456",
    language: "English"
  };
  constructor(private router: Router) { }

  ngOnInit() {
  }

  delete(){
    //REST API for deletion
    this.router.navigate(['/book-list']);
  }

}
