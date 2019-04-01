package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.After;
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

    private Employee paulaWalk = new Employee("Paul", "Walk");
    private Employee johnStaff = new Employee("John", "Staff");
    private Employee donaldBret = new Employee("Donald", "Bret");
    private Company softwareApp = new Company("Software App");
    private Company softwareLen = new Company("Software len");
    private Company appleSoft = new Company("Apple Soft");

    @Before
    public void before() {
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
    }

    @Test
    public void findEmployeeNameLikeTest() {
        //When
        List<Employee> employeeSearchFacade = manyToManyFacade.findEmployeeNameLike("Walk");
        //Then
        Assert.assertEquals(1, employeeSearchFacade.size());
    }

    @Test
    public void findCompanyNameLike() {
        //When
        List<Company> companySearchFacade = manyToManyFacade.findCompanyNameLike("Sof");
        //Then
        Assert.assertEquals(2, companySearchFacade.size());
    }

    @After
    public void after() {
        //CleanUp
        try {
            companyDao.delete(softwareApp);
            companyDao.delete(softwareLen);
            companyDao.delete(appleSoft);
        } catch (Exception e) {
            //do nothing
        }
    }
}