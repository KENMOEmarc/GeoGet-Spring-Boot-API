package com.wrath.GeoGet.models;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Country {
    private Name name;
    private List<String> tld;
    private String cca2;
    private String ccn3;
    private String cioc;
    private boolean independent;
    private String status;
    private boolean unMember;
    private Map<String, Currency> currencies;
    private Idd idd;
    private List<String> capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private Map<String, String> languages;
    private List<Double> latlng;
    private boolean landlocked;
    private List<String> borders;
    private double area;
    private Map<String, Demonym> demonyms;
    private String cca3;
    private Map<String, Translation> translations;
    private String flag;
    private Maps maps;
    private int population;
    private Map<String, Double> gini;
    private String fifa;
    private Car car;
    private List<String> timezones;
    private List<String> continents;
    private Flags flags;
    private CoatOfArms coatOfArms;
    private String startOfWeek;
    private CapitalInfo capitalInfo;
    private PostalCode postalCode;

    @Data
    public static class Name {
        private String common;
        private String official;
        private Map<String, Translation> nativeName;
    }

    @Data
    public static class Currency {
        private String name;
        private String symbol;
    }

    @Data
    public static class Idd {
        private String root;
        private List<String> suffixes;
    }

    @Data
    public static class Demonym {
        private String f;
        private String m;
    }

    @Data
    public static class Maps {
        private String googleMaps;
        private String openStreetMaps;
    }

    @Data
    public static class Car {
        private List<String> signs;
        private String side;
    }

    @Data
    public static class Flags {
        private String png;
        private String svg;
        private String alt;
    }

    @Data
    public static class CoatOfArms {
        private String png;
        private String svg;
    }

    @Data
    public static class CapitalInfo {
        private List<Double> latlng;
    }

    @Data
    public static class PostalCode {
        private String format;
        private String regex;
    }

    @Data
    public static class Translation {
        private String official;
        private String common;
    }
}
