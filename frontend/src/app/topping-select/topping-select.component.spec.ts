import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ToppingSelectComponent } from './topping-select.component';

describe('ToppingSelectComponent', () => {
  let component: ToppingSelectComponent;
  let fixture: ComponentFixture<ToppingSelectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ToppingSelectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ToppingSelectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
