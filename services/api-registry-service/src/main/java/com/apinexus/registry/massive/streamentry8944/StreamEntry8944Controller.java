package com.apinexus.registry.massive.streamentry8944;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamentry8944")
public class StreamEntry8944Controller {
    private final StreamEntry8944Service service;
    
    public StreamEntry8944Controller(StreamEntry8944Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamEntry8944> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamEntry8944 create(@RequestBody StreamEntry8944 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamEntry8944";
    }
}
