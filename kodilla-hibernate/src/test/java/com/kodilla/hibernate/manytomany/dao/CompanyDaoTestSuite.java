/*package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
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
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        Company readIdSoftwareMachineId = companyDao.findById(softwareMachineId);
        Company readIdDataMaestersId = companyDao.findById(dataMaestersId);
        Company readIdGreyMatterId = companyDao.findById(greyMatterId);
        //Then
        Assert.assertEquals(softwareMachineId, readIdSoftwareMachineId.getId());
        Assert.assertEquals(dataMaestersId, readIdDataMaestersId.getId());
        Assert.assertEquals(greyMatterId, readIdGreyMatterId.getId());

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedQueries() {
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
        List<Employee> lastName = employeeDao.retrieveEmployeeLastName("Walk");
        List<Company> nameStartWith = companyDao.findByThreeCharsPrefix("Sof");

        //Then
        Assert.assertEquals(1, lastName.size());
        Assert.assertEquals(2, nameStartWith.size());

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
*/