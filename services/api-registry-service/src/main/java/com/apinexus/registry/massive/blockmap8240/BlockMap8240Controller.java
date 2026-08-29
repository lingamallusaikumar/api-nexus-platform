package com.apinexus.registry.massive.blockmap8240;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/blockmap8240")
public class BlockMap8240Controller {
    private final BlockMap8240Service service;
    
    public BlockMap8240Controller(BlockMap8240Service service) { this.service = service; }
    
    @GetMapping
    public List<BlockMap8240> getAll() { return service.findAll(); }
    
    @PostMapping
    public BlockMap8240 create(@RequestBody BlockMap8240 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BlockMap8240";
    }
}
