package com.apinexus.registry.massive.sectorgraph2636;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorgraph2636")
public class SectorGraph2636Controller {
    private final SectorGraph2636Service service;
    
    public SectorGraph2636Controller(SectorGraph2636Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorGraph2636> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorGraph2636 create(@RequestBody SectorGraph2636 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorGraph2636";
    }
}
