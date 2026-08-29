package com.apinexus.registry.massive.blockbridge8958;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockbridge8958")
public class BlockBridge8958Controller {
    private final BlockBridge8958Service service;
    
    public BlockBridge8958Controller(BlockBridge8958Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockBridge8958> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockBridge8958 create(@RequestBody BlockBridge8958 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockBridge8958";
    }
}
