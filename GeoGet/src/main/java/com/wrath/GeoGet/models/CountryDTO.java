package com.wrath.GeoGet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class CountryDTO {
    private String name;
    private Map<String, Country.Translation> nativeName;
    private List<String> capital;
    private String cca2;
    private String ccn3;
    private String cioc;
    private boolean independent;
    private String status;
    private boolean unMember;
    private Map<String, Country.Currency> currencies;
    private String region;
    private String subregion;
    private int population;
    private String flag;
    private Map<String, String> languages;
    private List<Double> latlng;
    private List<String> timezones;
    private List<String> continents;
}
