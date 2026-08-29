package com.apinexus.registry.massive.blockflow5398;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockflow5398")
public class BlockFlow5398Controller {
    private final BlockFlow5398Service service;
    
    public BlockFlow5398Controller(BlockFlow5398Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockFlow5398> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockFlow5398 create(@RequestBody BlockFlow5398 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockFlow5398";
    }
}
