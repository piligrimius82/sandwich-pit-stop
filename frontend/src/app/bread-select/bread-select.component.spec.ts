import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BreadSelectComponent } from './bread-select.component';

describe('BreadSelectComponent', () => {
  let component: BreadSelectComponent;
  let fixture: ComponentFixture<BreadSelectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BreadSelectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BreadSelectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
