import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'bs-book-detail',
  templateUrl: './book-detail.component.html',
  styles: []
})
export class BookDetailComponent implements OnInit {

  book = {
    title: "Dummy Title",
    description: "Dummy Description",
    unitCost: "123",
    isbn: "123-456-7891",
    nbOfPages: "456",
    language: "English"
  };
  constructor() { }

  ngOnInit() {
  }

}
