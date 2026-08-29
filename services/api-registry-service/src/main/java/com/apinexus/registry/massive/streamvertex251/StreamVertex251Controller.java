package com.apinexus.registry.massive.streamvertex251;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamvertex251")
public class StreamVertex251Controller {
    private final StreamVertex251Service service;
    
    public StreamVertex251Controller(StreamVertex251Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamVertex251> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamVertex251 create(@RequestBody StreamVertex251 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamVertex251";
    }
}
