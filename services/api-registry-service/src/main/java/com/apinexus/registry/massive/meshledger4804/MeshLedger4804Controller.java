package com.apinexus.registry.massive.meshledger4804;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/meshledger4804")
public class MeshLedger4804Controller {
    private final MeshLedger4804Service service;
    
    public MeshLedger4804Controller(MeshLedger4804Service service) { this.service = service; }
    
    @GetMapping
    public List<MeshLedger4804> getAll() { return service.findAll(); }
    
    @PostMapping
    public MeshLedger4804 create(@RequestBody MeshLedger4804 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed MeshLedger4804";
    }
}
