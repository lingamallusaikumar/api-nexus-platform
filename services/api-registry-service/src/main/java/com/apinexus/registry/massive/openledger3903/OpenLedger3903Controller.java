package com.apinexus.registry.massive.openledger3903;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openledger3903")
public class OpenLedger3903Controller {
    private final OpenLedger3903Service service;
    
    public OpenLedger3903Controller(OpenLedger3903Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenLedger3903> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenLedger3903 create(@RequestBody OpenLedger3903 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenLedger3903";
    }
}
