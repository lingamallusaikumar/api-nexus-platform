package com.apinexus.registry.massive.streamlog546;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamlog546")
public class StreamLog546Controller {
    private final StreamLog546Service service;
    
    public StreamLog546Controller(StreamLog546Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamLog546> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamLog546 create(@RequestBody StreamLog546 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamLog546";
    }
}
