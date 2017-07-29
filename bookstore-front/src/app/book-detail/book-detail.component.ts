import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {Book} from "../service/model/Book";
import {BookApi} from "../service/api/BookApi";

@Component({
  selector: 'bs-book-detail',
  templateUrl: './book-detail.component.html',
  styles: []
})
export class BookDetailComponent implements OnInit {

  book:Book = {};
  constructor(private router: Router, private bookService: BookApi) { }

  ngOnInit() {
    this.bookService.getBook(1001).subscribe(book => this.book = book)
  }

  delete(){
    //REST API for deletion
    this.router.navigate(['/book-list']);
  }

}
