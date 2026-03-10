package com.wrath.GeoGet.controller;

import com.wrath.GeoGet.models.CountryDTO;
import com.wrath.GeoGet.services.CountryService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/name/{name}")
    public List<CountryDTO> getCountry(@PathVariable String name) {
         return countryService.getCountryByName(name);
    }

    @GetMapping("/lang/{lang}")
    public List<CountryDTO> getCountriesByLanguage(@PathVariable String lang) {
        return countryService.getCountryByLanguage(lang);
    }

    @GetMapping("/region/{region}")
    public List<CountryDTO> getCountriesByRegion(@PathVariable String region) {
        return countryService.getCountryByRegion(region);
    }

    @GetMapping("/capital/{capital}")
    public Mono<CountryDTO> getCountriesByCapital(@PathVariable String capital) {
        return countryService.getCountryByCapital(capital);
    }

    @GetMapping("/currency/{currency}")
    public List<CountryDTO> getCountriesByCurrency(@PathVariable String currency) {
        return countryService.getCountryByCurrency(currency);
    }
}
