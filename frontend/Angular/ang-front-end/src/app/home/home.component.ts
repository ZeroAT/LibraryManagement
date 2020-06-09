import { Component, OnInit } from '@angular/core';
import { HomeService } from './home.service';
import { Book } from '../shared/models/Book';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  bookList:Book[];
  errorMessage:string;
  constructor(private homeService:HomeService) { }

  ngOnInit() {
    this.getAllBooks();
  }

  getAllBooks(){
    console.log("test");
    this.homeService.getAllBooks().subscribe(entity => {this.bookList = entity},error=> this.errorMessage = error);
  }

}
