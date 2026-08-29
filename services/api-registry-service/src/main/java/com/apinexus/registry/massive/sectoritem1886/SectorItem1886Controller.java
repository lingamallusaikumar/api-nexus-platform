package com.apinexus.registry.massive.sectoritem1886;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectoritem1886")
public class SectorItem1886Controller {
    private final SectorItem1886Service service;
    
    public SectorItem1886Controller(SectorItem1886Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorItem1886> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorItem1886 create(@RequestBody SectorItem1886 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorItem1886";
    }
}
