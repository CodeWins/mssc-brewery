package ca.iva.msscbrewery.services.v2;

import ca.iva.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created By iVa on 7/16/2021.
 */
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public Object getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public BeerDtoV2 updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
