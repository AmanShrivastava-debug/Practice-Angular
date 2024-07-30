import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InsurancDetailsComponent } from './insuranc-details.component';

describe('InsurancDetailsComponent', () => {
  let component: InsurancDetailsComponent;
  let fixture: ComponentFixture<InsurancDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [InsurancDetailsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(InsurancDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
