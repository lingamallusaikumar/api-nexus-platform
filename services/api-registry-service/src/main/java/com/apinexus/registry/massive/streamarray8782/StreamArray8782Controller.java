package com.apinexus.registry.massive.streamarray8782;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamarray8782")
public class StreamArray8782Controller {
    private final StreamArray8782Service service;
    
    public StreamArray8782Controller(StreamArray8782Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamArray8782> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamArray8782 create(@RequestBody StreamArray8782 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamArray8782";
    }
}
