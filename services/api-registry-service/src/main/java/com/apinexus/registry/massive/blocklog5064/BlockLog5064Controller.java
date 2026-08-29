package com.apinexus.registry.massive.blocklog5064;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blocklog5064")
public class BlockLog5064Controller {
    private final BlockLog5064Service service;
    
    public BlockLog5064Controller(BlockLog5064Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockLog5064> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockLog5064 create(@RequestBody BlockLog5064 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockLog5064";
    }
}
