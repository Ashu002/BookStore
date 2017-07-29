import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'bs-book-form',
  templateUrl: './book-form.component.html',
  styles: []
})
export class BookFormComponent implements OnInit {

  book = {
    title: "Dummy Title",
    description: "Dummy Description",
    unitCost: "123",
    isbn: "123-456-7891",
    nbOfPages: "456",
    language: "English",
    inmUrl: ""
  };

  constructor() { }

  ngOnInit() {
  }

}
