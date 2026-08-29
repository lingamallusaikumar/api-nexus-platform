package com.apinexus.registry.massive.blockworker7468;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockworker7468")
public class BlockWorker7468Controller {
    private final BlockWorker7468Service service;
    
    public BlockWorker7468Controller(BlockWorker7468Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockWorker7468> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockWorker7468 create(@RequestBody BlockWorker7468 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockWorker7468";
    }
}
