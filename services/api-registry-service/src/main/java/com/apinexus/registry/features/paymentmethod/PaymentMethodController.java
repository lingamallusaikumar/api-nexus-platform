package com.apinexus.registry.features.paymentmethod;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/paymentmethod")
public class PaymentMethodController {
    private final PaymentMethodService service;
    public PaymentMethodController(PaymentMethodService service) { this.service = service; }
    @GetMapping
    public List<PaymentMethod> getAll() { return service.findAll(); }
    @PostMapping
    public PaymentMethod create(@RequestBody PaymentMethod entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
