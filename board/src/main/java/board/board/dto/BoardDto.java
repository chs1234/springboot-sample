package board.board.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class BoardDto {
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String creatorId;
	private LocalDateTime createdAt;
	private String updaterId;
	private LocalDateTime updatedAt;
	private List<BoardFileDto> fileList;
}
