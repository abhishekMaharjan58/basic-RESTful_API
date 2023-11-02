package com.example.demo.controller;

import com.example.demo.pojo.InvoicePojo;
import com.example.demo.service.impl.InvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private  InvoiceServiceImpl invoiceService;

    @PostMapping(value = "/")
    ResponseEntity<?> addInvoice(@RequestBody InvoicePojo invoicePojo){
        try{
            return  ResponseEntity.ok(invoiceService.addInvoice(invoicePojo));
        }catch(Exception ex){
            ex.printStackTrace();
            return  ResponseEntity.status(500).body(ex.getLocalizedMessage());
        }
    }
}
