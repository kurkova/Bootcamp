package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("124/10/2018");
        Product milk = new Product("milk");
        Item item1 = new Item(new BigDecimal(3), 3);
        Item item2 = new Item(new BigDecimal(4), 2);
        milk.getItems().add(item1);
        milk.getItems().add(item2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setProduct(milk);
        item2.setProduct(milk);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        Invoice readInvoice = invoiceDao.findOne(id);

        //Then
        Assert.assertEquals(id, readInvoice.getId());

        //CleanUp
        invoiceDao.delete(id);
    }
}
