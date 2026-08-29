package com.apinexus.registry.massive.closedbuffer4684;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedbuffer4684")
public class ClosedBuffer4684Controller {
    private final ClosedBuffer4684Service service;
    
    public ClosedBuffer4684Controller(ClosedBuffer4684Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedBuffer4684> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedBuffer4684 create(@RequestBody ClosedBuffer4684 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedBuffer4684";
    }
}
