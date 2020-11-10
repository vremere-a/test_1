package test_1.demo.model.dto.root;

import org.springframework.stereotype.Component;
import test_1.demo.model.Root;

@Component
public class RootDtoMapper {
    public Root mapToRoot(RootRequestDto nodeRootRequestDto) {
        Root nodeRoot = new Root();
        nodeRoot.setName(nodeRootRequestDto.getName());
        return nodeRoot;
    }

    public RootResponseDto mapToResponseDto(Root node) {
        RootResponseDto nodeResponseDto = new RootResponseDto();
        nodeResponseDto.setNodeId(node.getId());
        nodeResponseDto.setNodeName(node.getName());
        return nodeResponseDto;
    }
}
