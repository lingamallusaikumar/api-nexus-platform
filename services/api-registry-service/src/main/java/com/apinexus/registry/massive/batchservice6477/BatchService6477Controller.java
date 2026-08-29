package com.apinexus.registry.massive.batchservice6477;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchservice6477")
public class BatchService6477Controller {
    private final BatchService6477Service service;
    
    public BatchService6477Controller(BatchService6477Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchService6477> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchService6477 create(@RequestBody BatchService6477 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchService6477";
    }
}
