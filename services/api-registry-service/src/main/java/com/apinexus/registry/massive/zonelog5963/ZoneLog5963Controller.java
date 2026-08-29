package com.apinexus.registry.massive.zonelog5963;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonelog5963")
public class ZoneLog5963Controller {
    private final ZoneLog5963Service service;
    
    public ZoneLog5963Controller(ZoneLog5963Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneLog5963> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneLog5963 create(@RequestBody ZoneLog5963 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneLog5963";
    }
}
