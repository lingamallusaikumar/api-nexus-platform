package com.apinexus.registry.massive.streampool1403;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streampool1403")
public class StreamPool1403Controller {
    private final StreamPool1403Service service;
    
    public StreamPool1403Controller(StreamPool1403Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamPool1403> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamPool1403 create(@RequestBody StreamPool1403 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamPool1403";
    }
}
