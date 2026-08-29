package com.apinexus.registry.massive.closedpool3391;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedpool3391")
public class ClosedPool3391Controller {
    private final ClosedPool3391Service service;
    
    public ClosedPool3391Controller(ClosedPool3391Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedPool3391> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedPool3391 create(@RequestBody ClosedPool3391 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedPool3391";
    }
}
