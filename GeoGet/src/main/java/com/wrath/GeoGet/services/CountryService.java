package com.wrath.GeoGet.services;

import com.wrath.GeoGet.exceptions.CountryNotFoundException;
import com.wrath.GeoGet.models.Country;
import com.wrath.GeoGet.models.CountryDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class CountryService {

    private final WebClient webClient;
    private final CountryMapper countryMapper;

    public CountryService(CountryMapper countryMapper, WebClient webClient) {
        this.webClient = webClient;
        this.countryMapper = countryMapper;
    }

    public List<CountryDTO> getCountryByName(String name) {
        return webClient.get()
                .uri("/name/{name}", name)
                .retrieve()
                .bodyToFlux(Country.class)
                .toStream()
                .map(countryMapper::toDTO)
                .toList();
    }

    public List<CountryDTO> getCountryByLanguage(String lang) {
        return Arrays.stream(Objects.requireNonNull(webClient.get()
                        .uri("/lang/{lang}", lang)
                        .retrieve()
                        .bodyToFlux(Country[].class)
                        .blockFirst()))
                .map(countryMapper::toDTO)
                .toList();
    }

    public List<CountryDTO> getCountryByRegion(String region) {
        return Arrays.stream(Objects.requireNonNull(webClient.get()
                        .uri("/region/{region}", region)
                        .retrieve()
                        .bodyToFlux(Country[].class)
                        .blockFirst()))
                .map(countryMapper::toDTO)
                .toList();
    }

    public Mono<CountryDTO> getCountryByCapital(String capital) {

        return webClient.get()
                .uri("/capital/{capital}", capital)
                .retrieve()
                .bodyToFlux(Country.class)
                .next()
                .map(countryMapper::toDTO);
    }

    public List<CountryDTO> getCountryByCurrency(String currency) {
        return Arrays.stream(Objects.requireNonNull(webClient.get()
                        .uri("/currency/{currency}", currency)
                        .retrieve()
                        .bodyToFlux(Country[].class)
                        .blockFirst()))
                .map(countryMapper::toDTO)
                .toList();
    }
}
