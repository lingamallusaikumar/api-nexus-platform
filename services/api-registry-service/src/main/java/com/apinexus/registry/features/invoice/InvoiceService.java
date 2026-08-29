package com.apinexus.registry.features.invoice;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepository repository;
    public InvoiceService(InvoiceRepository repository) { this.repository = repository; }
    public List<Invoice> findAll() { return repository.findAll(); }
    public Invoice save(Invoice entity) { return repository.save(entity); }
    public void complexBusinessLogic1() { /* Implementation */ }
    public void complexBusinessLogic2() { /* Implementation */ }
    public void complexBusinessLogic3() { /* Implementation */ }
    public void complexBusinessLogic4() { /* Implementation */ }
}
