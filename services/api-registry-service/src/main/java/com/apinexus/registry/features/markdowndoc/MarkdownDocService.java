package com.apinexus.registry.features.markdowndoc;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MarkdownDocService {
    private final MarkdownDocRepository repository;
    public MarkdownDocService(MarkdownDocRepository repository) { this.repository = repository; }
    public List<MarkdownDoc> findAll() { return repository.findAll(); }
    public MarkdownDoc save(MarkdownDoc entity) { return repository.save(entity); }
    public void complexBusinessLogic1() { /* Implementation */ }
    public void complexBusinessLogic2() { /* Implementation */ }
    public void complexBusinessLogic3() { /* Implementation */ }
    public void complexBusinessLogic4() { /* Implementation */ }
}
