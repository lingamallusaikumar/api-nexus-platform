package com.apinexus.registry.massive.closedprocess674;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedprocess674")
public class ClosedProcess674Controller {
    private final ClosedProcess674Service service;
    
    public ClosedProcess674Controller(ClosedProcess674Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedProcess674> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedProcess674 create(@RequestBody ClosedProcess674 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedProcess674";
    }
}
