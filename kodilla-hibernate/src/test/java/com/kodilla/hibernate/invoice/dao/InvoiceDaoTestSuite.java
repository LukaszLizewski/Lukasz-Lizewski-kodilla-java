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
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    private final static String NAME_OF_PRODUCT = "EntityTest Product: name of product";
    private final static String NAME_OF_PRODUCT_1 = "Product no 1";
    private final static String NAME_OF_PRODUCT_2 = "Product no 2";
    private final static String NAME_OF_PRODUCT_3 = "Product no 3";
    private final static String INVOICE_NO_1 = "XCV132";
    private final static String INVOICE_NO_2 = "XCV333";
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    public void testEntityProduct(){
        //Given
        Product product = new Product(NAME_OF_PRODUCT);
        productDao.save(product);
        int idProduct = product.getId();
        //When
        List<Product> resultList = productDao.findByName(NAME_OF_PRODUCT);
        //Then
        Assert.assertEquals(1,resultList.size());
        //CleanUp
        productDao.deleteById(idProduct);
    }
    @Test
    public void testEntityItemWithProduct(){
        //Given
        Item item = new Item(new Product(NAME_OF_PRODUCT),new BigDecimal(120),100,new BigDecimal(12000));
        itemDao.save(item);
        int idItem = item.getId();
        //When
        List<Item> resultList = itemDao.findById(idItem);
        //Then
        Assert.assertEquals(1,resultList.size());
        //CleanUp
        itemDao.deleteById(idItem);
    }
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Invoice invoice1 = new Invoice(INVOICE_NO_1);
        Invoice invoice2 = new Invoice(INVOICE_NO_2);
        Item item1 = new Item(new Product(NAME_OF_PRODUCT_1),new BigDecimal(120),100, new BigDecimal(12000));
        Item item2 = new Item(new Product(NAME_OF_PRODUCT_2),new BigDecimal(100),10, new BigDecimal(1000));
        Item item3 = new Item(new Product(NAME_OF_PRODUCT_3),new BigDecimal(10),1, new BigDecimal(10));
        //invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item1);
        //item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item1.setInvoice(invoice2);
        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        int id1 = invoice1.getId();
         List<Invoice> resultList = invoiceDao.findByNumber(INVOICE_NO_1);
        String resultInvoiceNumber = resultList.get(0).getNumber();
        //Then
        Assert.assertEquals(INVOICE_NO_1,resultInvoiceNumber);
        //CleanUp
        invoiceDao.deleteById(id1);
    }
}
