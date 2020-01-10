package io.factorialsystems.msscbeerservice.service;

import io.factorialsystems.msscbeerservice.web.model.BeerDto;
import io.factorialsystems.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID id) {

        return BeerDto.builder().id(UUID.randomUUID())
                .version(100)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .beerName("Trophy")
                .beerStyle(BeerStyleEnum.ALE)
                .upc(100)
                .price(new BigDecimal(12.99))
                .QuantityOnHand(1200).build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        return BeerDto.builder()
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .beerStyle(BeerStyleEnum.ALE)
                .beerName("Budweiser")
                .price(new BigDecimal(12.95))
                .QuantityOnHand(10)
                .upc(123456789L)
                .version(2)
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteBeerById(UUID beerId) {

    }

    @Override
    public List<BeerDto> getBeers() {
        return null;
    }
}
