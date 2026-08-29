package com.apinexus.registry.massive.streamlink9344;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamlink9344")
public class StreamLink9344Controller {
    private final StreamLink9344Service service;
    
    public StreamLink9344Controller(StreamLink9344Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamLink9344> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamLink9344 create(@RequestBody StreamLink9344 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamLink9344";
    }
}
