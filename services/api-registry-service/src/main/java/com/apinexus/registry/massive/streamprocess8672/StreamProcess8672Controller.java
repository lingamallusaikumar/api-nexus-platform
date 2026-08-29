package com.apinexus.registry.massive.streamprocess8672;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/streamprocess8672")
public class StreamProcess8672Controller {
    private final StreamProcess8672Service service;
    
    public StreamProcess8672Controller(StreamProcess8672Service service) { this.service = service; }
    
    @GetMapping
    public List<StreamProcess8672> getAll() { return service.findAll(); }
    
    @PostMapping
    public StreamProcess8672 create(@RequestBody StreamProcess8672 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StreamProcess8672";
    }
}
