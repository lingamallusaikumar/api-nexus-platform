package com.apinexus.registry.massive.batchmodule7713;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchmodule7713")
public class BatchModule7713Controller {
    private final BatchModule7713Service service;
    
    public BatchModule7713Controller(BatchModule7713Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchModule7713> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchModule7713 create(@RequestBody BatchModule7713 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchModule7713";
    }
}
