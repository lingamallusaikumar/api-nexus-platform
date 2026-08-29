package com.apinexus.registry.massive.streamlink767;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamlink767")
public class StreamLink767Controller {
    private final StreamLink767Service service;
    
    public StreamLink767Controller(StreamLink767Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamLink767> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamLink767 create(@RequestBody StreamLink767 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamLink767";
    }
}
