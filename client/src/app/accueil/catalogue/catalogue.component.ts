import { Component, Input, OnInit } from '@angular/core';
import { Album } from '../../model/Album';

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.scss']
})
export class CatalogueComponent implements OnInit {

  @Input() album!: Album

  constructor() { }

  ngOnInit(): void {
  }

}
