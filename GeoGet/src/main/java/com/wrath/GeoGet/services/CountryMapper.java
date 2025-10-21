package com.wrath.GeoGet.services;

import com.wrath.GeoGet.models.Country;
import com.wrath.GeoGet.models.CountryDTO;
import org.springframework.stereotype.Service;

@Service
public class CountryMapper {
    public CountryDTO toDTO(Country country){
        return new CountryDTO(country.getName().getCommon(),
                country.getName().getNativeName(),
                country.getCapital(),
                country.getCca2(),
                country.getCcn3(),
                country.getCioc(),
                country.isIndependent(),
                country.getStatus(),
                country.isUnMember(),
                country.getCurrencies(),
                country.getRegion(),
                country.getSubregion(),
                country.getPopulation(),
                country.getFlag(),
                country.getLanguages(),
                country.getLatlng(),
                country.getTimezones(),
                country.getContinents()
        );
    }
}
