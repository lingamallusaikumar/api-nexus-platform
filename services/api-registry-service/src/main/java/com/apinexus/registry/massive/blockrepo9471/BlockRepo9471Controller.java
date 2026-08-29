package com.apinexus.registry.massive.blockrepo9471;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockrepo9471")
public class BlockRepo9471Controller {
    private final BlockRepo9471Service service;
    
    public BlockRepo9471Controller(BlockRepo9471Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockRepo9471> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockRepo9471 create(@RequestBody BlockRepo9471 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockRepo9471";
    }
}
