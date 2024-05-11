import { Component, OnInit, OnDestroy } from '@angular/core';
import { Animal } from '../../models/animal';
import { AnimalsService } from '../../services/animals/animals.service';
import { Subscription } from 'rxjs/internal/Subscription';

@Component({
  selector: 'app-animals',
  templateUrl: './animals.component.html',
  styleUrl: './animals.component.css'
})
export class AnimalsComponent implements OnInit, OnDestroy {
  animals: Animal[] = [];

  animalsSub: Subscription | undefined;

  constructor(private animalsService: AnimalsService) {}

  ngOnInit() {
    this.animalsSub = this.animalsService.getAll().subscribe({
      next: (animals: Animal[]) => (this.animals = animals),
      error: (e: any) => console.log(e),
    });
  }

  ngOnDestroy(): void {
    this.animalsSub?.unsubscribe();
  }

  booleanToPl(value: boolean): string {
    if (value) {
      return "Tak"
    }
    return "Nie"
  }
}
