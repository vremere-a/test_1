package test_1.demo.controllers;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import test_1.demo.model.Desk;
import test_1.demo.model.dto.desk.DeskRequestDto;
import test_1.demo.model.dto.desk.DeskResponseDto;
import test_1.demo.model.dto.desk.DeskDtoMapper;
import test_1.demo.service.NodeService;

@RestController
@RequestMapping(path = "/desk")
public class DeskController {
    private final NodeService<Desk> deskService;
    private final DeskDtoMapper deskDtoMapper;

    public DeskController(DeskDtoMapper deskDtoMapper, NodeService<Desk> deskService) {
        this.deskDtoMapper = deskDtoMapper;
        this.deskService = deskService;
    }

    @PostMapping
    public Mono<Desk> addNode(@RequestBody DeskRequestDto nodeDeskRequestDto) {
        return deskService.add(deskDtoMapper.mapToDesk(nodeDeskRequestDto));
    }

    @GetMapping
    public @ResponseBody Flux<DeskResponseDto> getAllNodes() {
        return deskService.getAll().map(deskDtoMapper::mapToResponseDto);
    }
}