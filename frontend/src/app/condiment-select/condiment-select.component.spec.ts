import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CondimentSelectComponent } from './condiment-select.component';

describe('CondimentSelectComponent', () => {
  let component: CondimentSelectComponent;
  let fixture: ComponentFixture<CondimentSelectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CondimentSelectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CondimentSelectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
