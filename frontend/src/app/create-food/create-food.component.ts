import { Component, OnInit } from '@angular/core';
import {Food} from "../Food";
import {Router} from "@angular/router";
import {FoodService} from "../food.service";

@Component({
  selector: 'app-create-food',
  templateUrl: './create-food.component.html',
  styleUrls: ['./create-food.component.css']
})
export class CreateFoodComponent implements OnInit {


  food: Food = new Food();
  submitted = false;

  constructor(private foodService:FoodService,
              private router: Router) { }

  ngOnInit() {
  }

  newFood(): void {
    this.submitted = false;
    this.food = new Food();
  }

  save() {
    this.foodService
        .createFood(this.food).subscribe(data => {
          console.log(data)
          this.food = new Food();
          this.gotoList();
        },
        error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/foodItem']);
  }
}
