package com.apinexus.registry.massive.blockengine9758;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockengine9758")
public class BlockEngine9758Controller {
    private final BlockEngine9758Service service;
    
    public BlockEngine9758Controller(BlockEngine9758Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockEngine9758> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockEngine9758 create(@RequestBody BlockEngine9758 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockEngine9758";
    }
}
