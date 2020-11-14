
package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedNativeQuery;
import java.util.List;

@Service
public final class FacadeFinder {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    public List<Company> findCompany (String threeLetters) {
        return companyDao.retrieveCompaniesWithAnyThreeLetters(threeLetters);
    }
    public List<Employee> findEmployee (String threeLetters) {
        return employeeDao.retrieveEmployeeByAnyThreeLettersOfLastName(threeLetters);
    }
}

