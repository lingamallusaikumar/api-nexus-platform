package com.apinexus.registry.massive.blockpath3512;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockpath3512")
public class BlockPath3512Controller {
    private final BlockPath3512Service service;
    
    public BlockPath3512Controller(BlockPath3512Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockPath3512> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockPath3512 create(@RequestBody BlockPath3512 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockPath3512";
    }
}
