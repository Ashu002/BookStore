import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'bs-book-list',
  templateUrl: './book-list.component.html',
  styles: []
})
export class BookListComponent implements OnInit {

  ngBooks:number = 2;
  books = [
    {
      id: 1,
      imgUrl: "https://rukminim1.flixcart.com/image/128/128/book/3/0/5/life-is-what-you-make-it-original-imaee4gnyenzcsyy.jpeg",
      title: "Title1",
      description: "Dummy Description-1"
    },
    {
      id:2,
      imgUrl: "https://rukminim1.flixcart.com/image/128/128/book/3/0/5/life-is-what-you-make-it-original-imaee4gnyenzcsyy.jpeg",
      title: "Title2",
      description: "Dummy Description-2"
    }
  ];
  constructor() { }

  ngOnInit() {
  }

}
