import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CheeseSelectComponent } from './cheese-select.component';

describe('CheeseSelectComponent', () => {
  let component: CheeseSelectComponent;
  let fixture: ComponentFixture<CheeseSelectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CheeseSelectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheeseSelectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
