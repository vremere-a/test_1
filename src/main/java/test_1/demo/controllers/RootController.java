package test_1.demo.controllers;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import test_1.demo.model.Root;
import test_1.demo.model.dto.root.RootDtoMapper;
import test_1.demo.model.dto.root.RootResponseDto;
import test_1.demo.model.dto.root.RootRequestDto;
import test_1.demo.service.NodeService;

@RestController
@RequestMapping(path = "/root")
public class RootController {
    private final NodeService<Root> rootService;
    private final RootDtoMapper rootDtoMapper;

    public RootController(NodeService<Root> rootService, RootDtoMapper rootDtoMapper) {
        this.rootService = rootService;
        this.rootDtoMapper = rootDtoMapper;
    }

    @PostMapping
    public Mono<Root> addNode(@RequestBody RootRequestDto nodeRootRequestDto) {
        return rootService.add(rootDtoMapper.mapToRoot(nodeRootRequestDto));
    }

    @GetMapping
    public @ResponseBody
    Flux<RootResponseDto> getAllNodes() {
        return rootService.getAll().map(rootDtoMapper::mapToResponseDto);   
    }
}