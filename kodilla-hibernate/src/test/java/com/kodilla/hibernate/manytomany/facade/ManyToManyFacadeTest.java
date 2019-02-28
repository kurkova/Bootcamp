package com.kodilla.hibernate.manytomany.facade;
/*
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ManyToManyFacadeTest {
    @Autowired
    private ManyToManyFacade manyToManyFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    @Before
    public void before() {

    }

    @Test
    public void findEmployeeNameLikeTest() {
        Employee paulaWalk = new Employee("Paul", "Walk");
        Employee johnStaff = new Employee("John", "Staff");
        Employee donaldBret = new Employee("Donald", "Bret");

        Company softwareApp = new Company("Software App");
        Company softwareLen = new Company("Software len");
        Company appleSoft = new Company("Apple Soft");

        softwareApp.getEmployees().add(paulaWalk);
        softwareLen.getEmployees().add(johnStaff);
        softwareLen.getEmployees().add(donaldBret);
        appleSoft.getEmployees().add(paulaWalk);
        appleSoft.getEmployees().add(donaldBret);

        paulaWalk.getCompanies().add(softwareApp);
        paulaWalk.getCompanies().add(appleSoft);
        johnStaff.getCompanies().add(softwareLen);
        donaldBret.getCompanies().add(appleSoft);
        donaldBret.getCompanies().add(softwareLen);

        companyDao.save(softwareApp);
        companyDao.save(softwareLen);
        companyDao.save(appleSoft);

        //When
        List<Employee> employeeSearchFacade = manyToManyFacade.findEmployeeNameLike("Walk");
        //Then
        Assert.assertEquals(1, employeeSearchFacade.size());
        //CleanUp
        try {
            companyDao.delete(softwareApp);
            companyDao.delete(softwareLen);
            companyDao.delete(appleSoft);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void findCompanyNameLike() {
        //Given
        //When
        List<Company> companySearchFacade = manyToManyFacade.findCompanyNameLike("Sof");
        //Then
        Assert.assertEquals(2, companySearchFacade.size());
    }
}
*/