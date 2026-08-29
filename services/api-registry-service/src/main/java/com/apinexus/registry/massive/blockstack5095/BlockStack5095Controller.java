package com.apinexus.registry.massive.blockstack5095;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockstack5095")
public class BlockStack5095Controller {
    private final BlockStack5095Service service;
    
    public BlockStack5095Controller(BlockStack5095Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockStack5095> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockStack5095 create(@RequestBody BlockStack5095 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockStack5095";
    }
}
