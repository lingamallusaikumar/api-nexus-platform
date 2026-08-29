package com.apinexus.registry.massive.closedthread4125;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedthread4125")
public class ClosedThread4125Controller {
    private final ClosedThread4125Service service;
    
    public ClosedThread4125Controller(ClosedThread4125Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedThread4125> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedThread4125 create(@RequestBody ClosedThread4125 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedThread4125";
    }
}
