package io.factorialsystems.msscbeerservice.service;

import io.factorialsystems.msscbeerservice.web.model.BeerDto;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID id);
    BeerDto saveNewBeer(BeerDto beerDto);
    void updateBeer(UUID beerId, BeerDto beerDto);
    void deleteBeerById(UUID beerId);
    List<BeerDto> getBeers();

}
