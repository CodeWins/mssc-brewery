package ca.iva.msscbrewery.services.v2;

import ca.iva.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * Created By iVa on 7/16/2021.
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    BeerDtoV2 updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);

}
