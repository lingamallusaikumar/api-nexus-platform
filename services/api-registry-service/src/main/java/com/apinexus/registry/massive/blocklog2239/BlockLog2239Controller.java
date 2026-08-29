package com.apinexus.registry.massive.blocklog2239;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blocklog2239")
public class BlockLog2239Controller {
    private final BlockLog2239Service service;
    
    public BlockLog2239Controller(BlockLog2239Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockLog2239> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockLog2239 create(@RequestBody BlockLog2239 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockLog2239";
    }
}
