package com.apinexus.registry.massive.blockworker1160;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockworker1160")
public class BlockWorker1160Controller {
    private final BlockWorker1160Service service;
    
    public BlockWorker1160Controller(BlockWorker1160Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockWorker1160> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockWorker1160 create(@RequestBody BlockWorker1160 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockWorker1160";
    }
}
