package com.apinexus.registry.massive.batchlink6904;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchlink6904")
public class BatchLink6904Controller {
    private final BatchLink6904Service service;
    
    public BatchLink6904Controller(BatchLink6904Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchLink6904> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchLink6904 create(@RequestBody BatchLink6904 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchLink6904";
    }
}
