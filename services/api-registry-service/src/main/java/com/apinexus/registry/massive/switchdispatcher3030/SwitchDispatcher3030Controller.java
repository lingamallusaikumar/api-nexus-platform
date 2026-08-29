package com.apinexus.registry.massive.switchdispatcher3030;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/switchdispatcher3030")
public class SwitchDispatcher3030Controller {
    private final SwitchDispatcher3030Service service;
    
    public SwitchDispatcher3030Controller(SwitchDispatcher3030Service service) { this.service = service; }
    
    @GetMapping
    public List<SwitchDispatcher3030> getAll() { return service.findAll(); }
    
    @PostMapping
    public SwitchDispatcher3030 create(@RequestBody SwitchDispatcher3030 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SwitchDispatcher3030";
    }
}
