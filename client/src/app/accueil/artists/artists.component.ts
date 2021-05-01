import { Component, Input, OnInit } from '@angular/core';
import { Artist } from '../../model/Artist';

@Component({
  selector: 'app-artists',
  templateUrl: './artists.component.html',
  styleUrls: ['./artists.component.scss']
})
export class ArtistsComponent implements OnInit {

  @Input() artist!: Artist

  constructor() { }

  ngOnInit(): void {
  }

}
