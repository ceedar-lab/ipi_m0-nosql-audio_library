import { Component, Input, OnInit } from '@angular/core';
import { Album } from 'src/app/model/Album';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.component.html',
  styleUrls: ['./albums.component.scss']
})
export class AlbumsComponent implements OnInit {

  @Input() album!: Album;

  constructor() { }

  ngOnInit(): void {
  }

}
