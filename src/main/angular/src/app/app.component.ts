import {Component} from '@angular/core';
import {AppService} from "./app.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  public userList;

  constructor(private appService: AppService) {
    this.userList = this.appService.getUserList();
    console.log(this.userList);
  }

}
