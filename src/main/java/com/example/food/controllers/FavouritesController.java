package com.example.food.controllers;

import com.example.food.pojos.FavouriteProductResponse;
import com.example.food.restartifacts.BaseResponse;
import com.example.food.services.FavouritesService;
import com.example.food.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/favourites")
public class FavouritesController {
    @Autowired
    private  FavouritesService favouritesService;

    @PostMapping("/{productId}/add")
    public ResponseEntity<BaseResponse> addProductToFavourite(@PathVariable(value = "productId") Long productId) {
        BaseResponse response = favouritesService.addToFavourites(productId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/view-favourite/{favouriteId}")
    public BaseResponse viewAFavouriteProduct(@PathVariable Long favouriteId){
        return favouritesService.viewAFavouriteProduct(favouriteId);
    }

    @GetMapping("/view-all")
    public ResponseEntity<FavouriteProductResponse> viewAllFavouriteProduct() {
        FavouriteProductResponse response = favouritesService.viewAllFavouriteProduct();
        return ResponseEntity.status(response.getCode()).body(response);
    }

    @DeleteMapping("/remove/{productId}")
    public ResponseEntity<BaseResponse> removeFromFavourites(@PathVariable Long productId) {
        BaseResponse response = favouritesService.removeFromFavourites(productId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}