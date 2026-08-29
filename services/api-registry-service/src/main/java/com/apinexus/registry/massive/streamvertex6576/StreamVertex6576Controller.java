package com.apinexus.registry.massive.streamvertex6576;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamvertex6576")
public class StreamVertex6576Controller {
    private final StreamVertex6576Service service;
    
    public StreamVertex6576Controller(StreamVertex6576Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamVertex6576> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamVertex6576 create(@RequestBody StreamVertex6576 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamVertex6576";
    }
}
