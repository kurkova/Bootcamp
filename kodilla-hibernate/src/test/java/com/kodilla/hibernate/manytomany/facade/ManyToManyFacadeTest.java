package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFacadeTest {
    @Autowired
    private ManyToManyFacade manyToManyFacade;
    @Autowired
    private CompanyDao companyDao;


    @Test
    public void findEmployeeNameLikeTest() {
        //Given
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
        //Given
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
        List<Company> companySearchFacade = manyToManyFacade.findCompanyNameLike("Sof");
        //Then
        Assert.assertEquals(2, companySearchFacade.size());
    }
}
