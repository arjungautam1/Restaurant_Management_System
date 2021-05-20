import {Component, OnInit} from '@angular/core';
import {FoodService} from "../food.service";
import {Router} from "@angular/router";
import {Observable} from "rxjs";
import {Food} from "../Food";

@Component({
  selector: 'app-food-list',
  templateUrl: './food-list.component.html',
  styleUrls: ['./food-list.component.css']
})
export class FoodListComponent implements OnInit {
  foods: Observable<Food[]>;

  constructor(private foodService: FoodService,
              private router: Router) {
  }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.foods = this.foodService.getFoodItemList();
  }

}