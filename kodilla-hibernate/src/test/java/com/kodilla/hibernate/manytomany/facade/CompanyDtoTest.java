
package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDtoTest {
    @Autowired
    FacadeFinder facadeFinder;
    @Test
    public void testCompanyQueryThreeLetters(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        //When
        facadeFinder.companyDao.save(softwareMachine);
        List<Company> resultList =facadeFinder.findCompany("oft");
        int resultListSize = resultList.size();
        int softwareMachineId = softwareMachine.getId();
        facadeFinder.companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        facadeFinder.companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        //Then
        Assert.assertEquals(1, resultListSize);
        //CleanUp
        try {
            facadeFinder.companyDao.deleteById(softwareMachineId);
            facadeFinder.companyDao.deleteById(dataMaestersId);
            facadeFinder.companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    public void testEmployeeQueryThreeLetters() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);
        //When
        facadeFinder.companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        facadeFinder.companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        facadeFinder.companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        List<Employee> resultList = facadeFinder.findEmployee("lar");
        int resultListSize = resultList.size();
        //Then
        Assert.assertEquals(1, resultListSize);
        //CleanUp
        try {
            facadeFinder.companyDao.deleteById(softwareMachineId);
            facadeFinder.companyDao.deleteById(dataMaestersId);
            facadeFinder.companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
}


