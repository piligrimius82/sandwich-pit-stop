import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MeatSelectComponent } from './meat-select.component';

describe('MeatSelectComponent', () => {
  let component: MeatSelectComponent;
  let fixture: ComponentFixture<MeatSelectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MeatSelectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MeatSelectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
