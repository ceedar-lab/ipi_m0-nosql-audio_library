import { Membre } from "./Membre";
import { Vente } from "./Vente";

export interface Album {
    titre: string,
    artiste: string,
    annee: number,
    prix: number,
    genre: string,
    pays: string,
    membres: Membre,
    ventes: Vente,
    image: string
}