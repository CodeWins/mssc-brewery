package ca.iva.msscbrewery.services;

import ca.iva.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created By iVa on 6/27/2021.
 */
public interface CustomerService {

    CustomerDto getCustomerById(UUID beerId);
}
