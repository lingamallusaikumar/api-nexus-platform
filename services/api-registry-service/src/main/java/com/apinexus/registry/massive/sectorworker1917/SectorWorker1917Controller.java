package com.apinexus.registry.massive.sectorworker1917;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/sectorworker1917")
public class SectorWorker1917Controller {
    private final SectorWorker1917Service service;
    
    public SectorWorker1917Controller(SectorWorker1917Service service) { this.service = service; }
    
    @GetMapping
    public List<SectorWorker1917> getAll() { return service.findAll(); }
    
    @PostMapping
    public SectorWorker1917 create(@RequestBody SectorWorker1917 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SectorWorker1917";
    }
}
