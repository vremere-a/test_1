package test_1.demo.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NodeService<T> {
    Mono<T> add(T node);

    Flux<T> getAll();
}
