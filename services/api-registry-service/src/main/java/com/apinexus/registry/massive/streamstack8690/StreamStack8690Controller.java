package com.apinexus.registry.massive.streamstack8690;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamstack8690")
public class StreamStack8690Controller {
    private final StreamStack8690Service service;
    
    public StreamStack8690Controller(StreamStack8690Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamStack8690> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamStack8690 create(@RequestBody StreamStack8690 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamStack8690";
    }
}
