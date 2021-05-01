import { Component, OnInit } from '@angular/core';
import { Album } from '../model/Album';
import { Artist } from '../model/Artist';
import { DataService } from '../service/data.service';

@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.component.html',
  styleUrls: ['./accueil.component.scss']
})
export class AccueilComponent implements OnInit {

  albums: Album[] = []
  albumsSorted: Album[] = []
  artists: Artist[] = []
  artistsSorted: Artist[] = []
  catalogueSorted: Album[] = []

  constructor(
    private dataService: DataService
  ) { }

  ngOnInit(): void {
    this.dataService.getAlbumsRequest().subscribe(res => {
      this.albums = <Album[]>res

      this.albumsSorted = [...this.albums.sort((a, b) => a.annee - b.annee)]
      
      this.artists = [...(this.albums.map(({ artiste, pays, genre}) => ({ artiste, pays, genre}))).filter((artist, index, self) => 
        index === self.findIndex(a => a.artiste === artist.artiste))]
      this.artistsSorted = this.artists.sort((a, b) => a.artiste.localeCompare(b.artiste))
      
      this.catalogueSorted = [...this.albums.sort((a, b) => a.prix - b.prix)]
    })
  }

  sortAlbums(value: any) {
    console.log(value)
    switch(value) {
      case "croissant": 
        this.albumsSorted = this.albumsSorted.sort((a, b) => a.annee - b.annee); break;
      default: 
        this.albumsSorted = this.albumsSorted.sort((a, b) => b.annee - a.annee)
    }
  }

    sortArtists(value: any) {
    switch(value) {
      case "croissant": 
        this.artistsSorted = this.artistsSorted.sort((a, b) => a.artiste.localeCompare(b.artiste)); break;
      default: 
        this.artistsSorted = this.artistsSorted.sort((a, b) => b.artiste.localeCompare(a.artiste))
    }
  }

  sortCatalogue(value: any) {
    switch(value) {
      case "prix_c": 
        this.catalogueSorted = this.catalogueSorted.sort((a, b) => a.prix - b.prix); break;
      case "prix_d": 
        this.catalogueSorted = this.catalogueSorted.sort((a, b) => b.prix - a.prix); break;
      case "titre_c": 
        this.catalogueSorted = this.catalogueSorted.sort((a, b) => a.prix - b.prix); break;
      default: 
        this.catalogueSorted = this.catalogueSorted.sort((a, b) => b.titre.localeCompare(a.titre))
    }
  }
}
