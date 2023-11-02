package com.example.demo.service;

import com.example.demo.model.Invoice;
import com.example.demo.pojo.InvoicePojo;

import java.util.List;

public interface InvoiceService {
    InvoicePojo addInvoice(InvoicePojo invoicePojo) throws Exception;
    Invoice checkIt(Integer id) throws Exception;
}
