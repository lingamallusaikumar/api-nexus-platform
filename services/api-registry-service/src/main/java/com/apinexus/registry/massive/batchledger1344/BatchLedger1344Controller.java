package com.apinexus.registry.massive.batchledger1344;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchledger1344")
public class BatchLedger1344Controller {
    private final BatchLedger1344Service service;
    
    public BatchLedger1344Controller(BatchLedger1344Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchLedger1344> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchLedger1344 create(@RequestBody BatchLedger1344 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchLedger1344";
    }
}
