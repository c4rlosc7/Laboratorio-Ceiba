import { Component, OnInit } from '@angular/core';
import { User } from './user';
import { USER_LIST } from './users.json';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: User[];

  constructor() { }

  ngOnInit() {
    this.users = USER_LIST;
  }

}
