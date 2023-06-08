package com.example.demoo.controllers;

import com.example.demoo.domain.Invoice;
import com.example.demoo.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping
    public List<Invoice> findAll() {
        return invoiceService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Invoice> findById(@PathVariable Long id) {
        return invoiceService.findById(id);
    }

    @PostMapping
    public Invoice save(@RequestBody Invoice invoice) {
        return invoiceService.save(invoice);
    }

    @PutMapping("/{id}")
    public Invoice update(@RequestBody Invoice invoice, @PathVariable Long id) {
        return invoiceService.update(invoice, id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        invoiceService.deleteById(id);
    }
}