package ca.iva.msscbrewery.services;

import ca.iva.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created By iVa on 6/26/2021.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
