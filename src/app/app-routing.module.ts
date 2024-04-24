import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AnimalsComponent } from './components/animals/animals.component';
import { StoreComponent } from './components/store/store.component';
import { ProfileComponent } from './components/profile/profile.component';

const routes: Routes = [
  { path: 'home', pathMatch: 'full', component: AppComponent },
  { path: '', pathMatch: 'full', redirectTo: '/home' },
  { path: 'animals', pathMatch: 'full', component: AnimalsComponent },
  { path: 'store', pathMatch: 'full', component: StoreComponent},
  { path: 'profile', pathMatch: 'full', component: ProfileComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
