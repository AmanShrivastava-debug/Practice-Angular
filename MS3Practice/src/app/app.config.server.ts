import { HttpClientModule } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
// import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { EmployeeListComponent } from "./employee-list/employee-list.component";
import { EmployeeDetailsComponent } from "./employee-details/employee-details.component";
import { EmployeeFormComponent } from "./employee-form/employee-form.component";

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    EmployeeFormComponent,
    EmployeeDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
