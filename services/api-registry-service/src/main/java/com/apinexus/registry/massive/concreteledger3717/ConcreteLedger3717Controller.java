package com.apinexus.registry.massive.concreteledger3717;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/concreteledger3717")
public class ConcreteLedger3717Controller {
    private final ConcreteLedger3717Service service;
    
    public ConcreteLedger3717Controller(ConcreteLedger3717Service service) { this.service = service; }
    
    @GetMapping
    public List<ConcreteLedger3717> getAll() { return service.findAll(); }
    
    @PostMapping
    public ConcreteLedger3717 create(@RequestBody ConcreteLedger3717 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ConcreteLedger3717";
    }
}
