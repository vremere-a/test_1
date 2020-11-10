package test_1.demo.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import test_1.demo.model.Desk;
import test_1.demo.repository.DeskRepository;

@Service
public class DeskServiceImpl implements NodeService<Desk>{
    private final DeskRepository nodeRepository;

    public DeskServiceImpl(DeskRepository nodeRepository) {
        this.nodeRepository = nodeRepository;
    }

    @Override
    public Mono<Desk> add(Desk node) {
        return nodeRepository.save(node);
    }

    @Override
    public Flux<Desk> getAll() {
        return nodeRepository.findAll();
    }
}
