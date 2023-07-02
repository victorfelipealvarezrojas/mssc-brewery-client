package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BreweryClintTest {

    @Autowired
    BreweryClint client;

    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void saveNewBeer() {
        BeerDto beerDto = BeerDto.builder()
                .beerName("New Beer")
                .id(UUID.randomUUID())
                .beerStyle("India Pale Ale")
                .upc(1234567890L)
                .build();

        URI uri = client.saveNewBeer(beerDto);
        assertNotNull(uri);
        System.out.println(uri.toString());
    }

    @Test
    void updateBeer() {
        BeerDto beerDto = BeerDto.builder()
                .beerName("New Beer")
                .id(UUID.randomUUID())
                .beerStyle("India Pale Ale")
                .upc(1234567890L)
                .build();

        client.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void deleteBeer() {
        client.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerById() {
        CustomerDto dto = client.getCustomerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void saveNewCustomer() {
        CustomerDto customerDto = CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Nw Customer")
                .build();

        URI uri = client.saveNewCustomer(customerDto);
        assertNotNull(uri);
        System.out.println(uri.toString());
    }

    @Test
    void updateCustomer() {
        CustomerDto customerDto = CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Nw Customer")
                .build();

        client.updateCustomer(UUID.randomUUID(), customerDto);
    }

    @Test
    void deleteCustomer() {
        client.deleteCustomer(UUID.randomUUID());
    }
}