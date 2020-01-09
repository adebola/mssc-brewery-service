package io.factorialsystems.msscbeerservice.bootstrap;

import io.factorialsystems.msscbeerservice.domain.Beer;
import io.factorialsystems.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        LoadBeers();

    }

    private void LoadBeers () {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Harp")
                    .beerStyle("IPA")
                    .upc(312453667890L)
                    .quantityToBrew(20)
                    .minOnHand(12)
                    .price(new BigDecimal(12.95))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Star")
                    .beerStyle("PALE_ALE")
                    .upc(3124536678446L)
                    .quantityToBrew(30)
                    .minOnHand(11)
                    .price(new BigDecimal(12.45))
                    .build());
        }

        System.out.println("Loaded Beers " + beerRepository.count());
    }
}
