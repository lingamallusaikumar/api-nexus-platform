package com.apinexus.registry.massive.blockinterface1297;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockinterface1297")
public class BlockInterface1297Controller {
    private final BlockInterface1297Service service;
    
    public BlockInterface1297Controller(BlockInterface1297Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockInterface1297> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockInterface1297 create(@RequestBody BlockInterface1297 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockInterface1297";
    }
}
