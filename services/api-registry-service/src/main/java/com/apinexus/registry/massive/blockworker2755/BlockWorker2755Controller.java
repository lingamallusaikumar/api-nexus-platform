package com.apinexus.registry.massive.blockworker2755;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockworker2755")
public class BlockWorker2755Controller {
    private final BlockWorker2755Service service;
    
    public BlockWorker2755Controller(BlockWorker2755Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockWorker2755> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockWorker2755 create(@RequestBody BlockWorker2755 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockWorker2755";
    }
}
