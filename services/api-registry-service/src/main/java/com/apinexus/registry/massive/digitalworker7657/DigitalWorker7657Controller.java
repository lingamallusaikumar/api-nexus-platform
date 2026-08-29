package com.apinexus.registry.massive.digitalworker7657;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/digitalworker7657")
public class DigitalWorker7657Controller {
    private final DigitalWorker7657Service service;
    
    public DigitalWorker7657Controller(DigitalWorker7657Service service) { this.service = service; }
    
    @GetMapping
    public List<DigitalWorker7657> getAll() { return service.findAll(); }
    
    @PostMapping
    public DigitalWorker7657 create(@RequestBody DigitalWorker7657 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DigitalWorker7657";
    }
}
