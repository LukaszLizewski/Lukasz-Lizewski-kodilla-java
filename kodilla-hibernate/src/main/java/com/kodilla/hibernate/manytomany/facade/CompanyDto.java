/*
package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedNativeQuery;
@NamedNativeQuery(
        name = "CompanyDto.retrieveCompaniesWithAnyThreeLetters",
        query = "SELECT * FROM companies WHERE company_name LIKE concat(\"%\",:SHORTNAME,\"%\" )",
        resultClass = CompanyDto.class
)
@Service
public final class CompanyDto {
    @Autowired
    Company company;
    public CompanyDto(Company company) {
        this.company = company;
    }
}
*/
