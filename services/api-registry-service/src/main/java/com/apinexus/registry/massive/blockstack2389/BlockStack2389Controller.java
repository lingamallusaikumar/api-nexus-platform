package com.apinexus.registry.massive.blockstack2389;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockstack2389")
public class BlockStack2389Controller {
    private final BlockStack2389Service service;
    
    public BlockStack2389Controller(BlockStack2389Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockStack2389> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockStack2389 create(@RequestBody BlockStack2389 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockStack2389";
    }
}
