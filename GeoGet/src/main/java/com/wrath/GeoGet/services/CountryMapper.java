package com.wrath.GeoGet.services;

import com.wrath.GeoGet.models.Country;
import com.wrath.GeoGet.models.CountryDTO;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CountryMapper {

    public CountryDTO toDTO(Country country) {
        if (country == null) {
            return null;
        }

        String nameCommon = country.getName() != null ? country.getName().getCommon() : null;
        String nameOfficial = country.getName() != null ? country.getName().getOfficial() : null;
        Map<String, CountryDTO.Translation> nativeName = convertTranslationMap(
                country.getName() != null ? country.getName().getNativeName() : null);

        List<String> tld = country.getTld() != null ? country.getTld() : Collections.emptyList();
        String cca2 = country.getCca2();
        String ccn3 = country.getCcn3();
        String cioc = country.getCioc();
        boolean independent = country.isIndependent();
        String status = country.getStatus();
        boolean unMember = country.isUnMember();

        Map<String, CountryDTO.Currency> currencies = convertCurrencyMap(country.getCurrencies());

        String iddRoot = country.getIdd() != null ? country.getIdd().getRoot() : null;
        List<String> iddSuffixes = country.getIdd() != null && country.getIdd().getSuffixes() != null
                ? country.getIdd().getSuffixes() : Collections.emptyList();

        List<String> capital = country.getCapital() != null ? country.getCapital() : Collections.emptyList();
        List<String> altSpellings = country.getAltSpellings() != null ? country.getAltSpellings() : Collections.emptyList();
        String region = country.getRegion();
        String subregion = country.getSubregion();
        Map<String, String> languages = country.getLanguages() != null ? country.getLanguages() : Collections.emptyMap();
        List<Double> latlng = country.getLatlng() != null ? country.getLatlng() : Collections.emptyList();
        boolean landlocked = country.isLandlocked();
        List<String> borders = country.getBorders() != null ? country.getBorders() : Collections.emptyList();
        double area = country.getArea();

        Map<String, CountryDTO.Demonym> demonyms = convertDemonymMap(country.getDemonyms());

        String cca3 = country.getCca3();
        Map<String, CountryDTO.Translation> translations = convertTranslationMap(country.getTranslations());
        String flag = country.getFlag();

        String mapsGoogleMaps = country.getMaps() != null ? country.getMaps().getGoogleMaps() : null;
        String mapsOpenStreetMaps = country.getMaps() != null ? country.getMaps().getOpenStreetMaps() : null;

        int population = country.getPopulation();
        Map<String, Double> gini = country.getGini() != null ? country.getGini() : Collections.emptyMap();
        String fifa = country.getFifa();

        List<String> carSigns = country.getCar() != null && country.getCar().getSigns() != null
                ? country.getCar().getSigns() : Collections.emptyList();
        String carSide = country.getCar() != null ? country.getCar().getSide() : null;

        List<String> timezones = country.getTimezones() != null ? country.getTimezones() : Collections.emptyList();
        List<String> continents = country.getContinents() != null ? country.getContinents() : Collections.emptyList();

        String flagsPng = country.getFlags() != null ? country.getFlags().getPng() : null;
        String flagsSvg = country.getFlags() != null ? country.getFlags().getSvg() : null;
        String flagsAlt = country.getFlags() != null ? country.getFlags().getAlt() : null;

        String coatOfArmsPng = country.getCoatOfArms() != null ? country.getCoatOfArms().getPng() : null;
        String coatOfArmsSvg = country.getCoatOfArms() != null ? country.getCoatOfArms().getSvg() : null;

        String startOfWeek = country.getStartOfWeek();

        List<Double> capitalInfoLatlng = country.getCapitalInfo() != null && country.getCapitalInfo().getLatlng() != null
                ? country.getCapitalInfo().getLatlng() : Collections.emptyList();

        String postalCodeFormat = country.getPostalCode() != null ? country.getPostalCode().getFormat() : null;
        String postalCodeRegex = country.getPostalCode() != null ? country.getPostalCode().getRegex() : null;

        return new CountryDTO(
                nameCommon, nameOfficial, nativeName,
                tld, cca2, ccn3, cioc, independent, status, unMember,
                currencies,
                iddRoot, iddSuffixes,
                capital, altSpellings, region, subregion, languages, latlng, landlocked, borders, area,
                demonyms,
                cca3, translations, flag,
                mapsGoogleMaps, mapsOpenStreetMaps,
                population, gini, fifa,
                carSigns, carSide,
                timezones, continents,
                flagsPng, flagsSvg, flagsAlt,
                coatOfArmsPng, coatOfArmsSvg,
                startOfWeek,
                capitalInfoLatlng,
                postalCodeFormat, postalCodeRegex
        );
    }

    private Map<String, CountryDTO.Translation> convertTranslationMap(Map<String, Country.Translation> source) {
        if (source == null) return Collections.emptyMap();
        return source.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> new CountryDTO.Translation(
                                e.getValue().getOfficial(),
                                e.getValue().getCommon()
                        )
                ));
    }

    private Map<String, CountryDTO.Currency> convertCurrencyMap(Map<String, Country.Currency> source) {
        if (source == null) return Collections.emptyMap();
        return source.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> new CountryDTO.Currency(
                                e.getValue().getName(),
                                e.getValue().getSymbol()
                        )
                ));
    }

    private Map<String, CountryDTO.Demonym> convertDemonymMap(Map<String, Country.Demonym> source) {
        if (source == null) return Collections.emptyMap();
        return source.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> new CountryDTO.Demonym(
                                e.getValue().getF(),
                                e.getValue().getM()
                        )
                ));
    }
}
