package test_1.demo.model.dto.desk;

import org.springframework.stereotype.Component;
import test_1.demo.model.Desk;

@Component
public class DeskDtoMapper {
    public Desk mapToDesk(DeskRequestDto nodeDeskRequestDto) {
        Desk nodeDesk = new Desk();
        nodeDesk.setName(nodeDeskRequestDto.getName());
        nodeDesk.setDescription(nodeDeskRequestDto.getDescription());
        return nodeDesk;
    }
    public DeskResponseDto mapToResponseDto(Desk node) {
        DeskResponseDto nodeResponseDto = new DeskResponseDto();
        nodeResponseDto.setNodeId(node.getId());
        nodeResponseDto.setNodeName(node.getName());
        nodeResponseDto.setNodeDescription(node.getDescription());
        return nodeResponseDto;
    }
}
