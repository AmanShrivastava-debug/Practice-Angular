import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EMployeeListComponent } from './employee-list.component';

describe('EMployeeListComponent', () => {
  let component: EMployeeListComponent;
  let fixture: ComponentFixture<EMployeeListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EMployeeListComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EMployeeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
