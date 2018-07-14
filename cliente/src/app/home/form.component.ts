import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  private titulo: String = 'Registro';

  constructor() { }

  ngOnInit() {
  }

}
