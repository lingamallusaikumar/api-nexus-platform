package com.apinexus.registry.massive.hubjob2192;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubjob2192")
public class HubJob2192Controller {
    private final HubJob2192Service service;
    
    public HubJob2192Controller(HubJob2192Service service) { this.service = service; }
    
    @GetMapping
    public List<HubJob2192> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubJob2192 create(@RequestBody HubJob2192 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubJob2192";
    }
}
