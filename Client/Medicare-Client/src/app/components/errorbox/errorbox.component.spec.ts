import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ErrorboxComponent } from './errorbox.component';

describe('ErrorboxComponent', () => {
  let component: ErrorboxComponent;
  let fixture: ComponentFixture<ErrorboxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ErrorboxComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ErrorboxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
