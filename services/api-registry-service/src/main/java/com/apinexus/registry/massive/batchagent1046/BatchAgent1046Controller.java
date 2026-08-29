package com.apinexus.registry.massive.batchagent1046;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchagent1046")
public class BatchAgent1046Controller {
    private final BatchAgent1046Service service;
    
    public BatchAgent1046Controller(BatchAgent1046Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchAgent1046> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchAgent1046 create(@RequestBody BatchAgent1046 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchAgent1046";
    }
}
