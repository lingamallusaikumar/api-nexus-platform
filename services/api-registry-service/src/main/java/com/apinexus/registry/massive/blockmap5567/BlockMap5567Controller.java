package com.apinexus.registry.massive.blockmap5567;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockmap5567")
public class BlockMap5567Controller {
    private final BlockMap5567Service service;
    
    public BlockMap5567Controller(BlockMap5567Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockMap5567> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockMap5567 create(@RequestBody BlockMap5567 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockMap5567";
    }
}
