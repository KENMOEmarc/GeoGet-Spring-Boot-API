package com.wrath.GeoGet.models;

import lombok.Data;

import java.util.List;
import java.util.Map;

public record CountryDTO(
        // Champs de Name (aplatis)
        String nameCommon,
        String nameOfficial,
        Map<String, Translation> nativeName,

        List<String> tld,
        String cca2,
        String ccn3,
        String cioc,
        boolean independent,
        String status,
        boolean unMember,

        Map<String, Currency> currencies,

        String iddRoot,
        List<String> iddSuffixes,

        List<String> capital,
        List<String> altSpellings,
        String region,
        String subregion,
        Map<String, String> languages,
        List<Double> latlng,
        boolean landlocked,
        List<String> borders,
        double area,

        Map<String, Demonym> demonyms,

        String cca3,
        Map<String, Translation> translations,
        String flag,

        String mapsGoogleMaps,
        String mapsOpenStreetMaps,

        int population,
        Map<String, Double> gini,
        String fifa,

        List<String> carSigns,
        String carSide,

        List<String> timezones,
        List<String> continents,

        String flagsPng,
        String flagsSvg,
        String flagsAlt,

        String coatOfArmsPng,
        String coatOfArmsSvg,

        String startOfWeek,

        List<Double> capitalInfoLatlng,

        String postalCodeFormat,
        String postalCodeRegex
) {
    public record Translation(String official, String common) {}
    public record Currency(String name, String symbol) {}
    public record Demonym(String f, String m) {}
}
