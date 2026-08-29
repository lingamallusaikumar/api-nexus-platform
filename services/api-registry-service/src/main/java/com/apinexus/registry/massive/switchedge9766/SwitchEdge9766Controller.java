package com.apinexus.registry.massive.switchedge9766;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchedge9766")
public class SwitchEdge9766Controller {
    private final SwitchEdge9766Service service;
    
    public SwitchEdge9766Controller(SwitchEdge9766Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchEdge9766> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchEdge9766 create(@RequestBody SwitchEdge9766 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchEdge9766";
    }
}
