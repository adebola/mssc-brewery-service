package io.factorialsystems.msscbeerservice.web.mappers;

import io.factorialsystems.msscbeerservice.domain.Beer;
import io.factorialsystems.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
