package com.apinexus.registry.massive.streaminterface3860;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streaminterface3860")
public class StreamInterface3860Controller {
    private final StreamInterface3860Service service;
    
    public StreamInterface3860Controller(StreamInterface3860Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamInterface3860> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamInterface3860 create(@RequestBody StreamInterface3860 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamInterface3860";
    }
}
