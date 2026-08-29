package com.apinexus.registry.massive.coreledger7162;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreledger7162")
public class CoreLedger7162Controller {
    private final CoreLedger7162Service service;
    
    public CoreLedger7162Controller(CoreLedger7162Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreLedger7162> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreLedger7162 create(@RequestBody CoreLedger7162 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreLedger7162";
    }
}
