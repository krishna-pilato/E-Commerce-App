import { Component, OnInit } from '@angular/core';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  generalIcon = environment.generalIcon;
  title = environment.title;
  navbarBackgroundColor = environment.navbarBackgroundColor;
  footerBackgroundColor = environment.footerBackgroundColor;
  dropdownBackground = "dropdown-menu-dark";
  isLogged = true;

  ngOnInit() {
    if (this.navbarBackgroundColor === 'Dark') {
      this.navbarBackgroundColor = 'navbar-dark bg-dark';
    } else if (this.navbarBackgroundColor === 'White') {
      this.navbarBackgroundColor = 'bg-light';
    }
    if (this.footerBackgroundColor === 'Dark') {
      this.footerBackgroundColor = 'bg-dark text-white';
    } else if (this.footerBackgroundColor === 'White') {
      this.footerBackgroundColor = 'bg-light text-dark';
    }
  }

  changeBackground($event: any): void {
    if (this.navbarBackgroundColor == 'bg-light') {
      this.navbarBackgroundColor = 'navbar-dark bg-dark';
      this.footerBackgroundColor = 'bg-dark text-white';
      this.dropdownBackground = 'dropdown-menu-dark';
    } else if (this.navbarBackgroundColor == 'navbar-dark bg-dark') {
      this.navbarBackgroundColor = 'bg-light';
      this.footerBackgroundColor = 'bg-light text-dark';
      this.dropdownBackground = '';
    }
  }
}