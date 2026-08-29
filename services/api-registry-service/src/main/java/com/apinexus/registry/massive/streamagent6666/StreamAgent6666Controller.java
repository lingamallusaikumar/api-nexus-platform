package com.apinexus.registry.massive.streamagent6666;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamagent6666")
public class StreamAgent6666Controller {
    private final StreamAgent6666Service service;
    
    public StreamAgent6666Controller(StreamAgent6666Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamAgent6666> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamAgent6666 create(@RequestBody StreamAgent6666 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamAgent6666";
    }
}
