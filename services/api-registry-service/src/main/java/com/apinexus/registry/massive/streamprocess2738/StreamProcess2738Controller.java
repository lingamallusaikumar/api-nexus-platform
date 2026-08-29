package com.apinexus.registry.massive.streamprocess2738;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamprocess2738")
public class StreamProcess2738Controller {
    private final StreamProcess2738Service service;
    
    public StreamProcess2738Controller(StreamProcess2738Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamProcess2738> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamProcess2738 create(@RequestBody StreamProcess2738 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamProcess2738";
    }
}
