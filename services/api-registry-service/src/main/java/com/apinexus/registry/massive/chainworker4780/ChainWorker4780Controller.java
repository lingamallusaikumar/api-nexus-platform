package com.apinexus.registry.massive.chainworker4780;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainworker4780")
public class ChainWorker4780Controller {
    private final ChainWorker4780Service service;
    
    public ChainWorker4780Controller(ChainWorker4780Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainWorker4780> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainWorker4780 create(@RequestBody ChainWorker4780 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainWorker4780";
    }
}
