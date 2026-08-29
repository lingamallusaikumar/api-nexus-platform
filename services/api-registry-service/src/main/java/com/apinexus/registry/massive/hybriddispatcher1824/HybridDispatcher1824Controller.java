package com.apinexus.registry.massive.hybriddispatcher1824;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybriddispatcher1824")
public class HybridDispatcher1824Controller {
    private final HybridDispatcher1824Service service;
    
    public HybridDispatcher1824Controller(HybridDispatcher1824Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridDispatcher1824> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridDispatcher1824 create(@RequestBody HybridDispatcher1824 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridDispatcher1824";
    }
}
