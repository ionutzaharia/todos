import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { TodosSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [TodosSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent],
})
export class TodosHomeModule {}
