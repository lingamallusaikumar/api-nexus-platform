package com.apinexus.registry.massive.batchtask8470;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchtask8470")
public class BatchTask8470Controller {
    private final BatchTask8470Service service;
    
    public BatchTask8470Controller(BatchTask8470Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchTask8470> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchTask8470 create(@RequestBody BatchTask8470 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchTask8470";
    }
}
