package board.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import board.board.entity.BoardEntity;
import board.board.entity.BoardFileEntity;

public interface JpaBoardRepository extends CrudRepository<BoardEntity, Integer> {
	
	List<BoardEntity> findAllByOrderByBoardIdxDesc();
	
//	@Query("SELECT file FROM BoardFileEntity file WHERE board_idx = ?1 AND idx = ?2")
//	BoardFileEntity findBoardFile(int boardIdx, int idx);

	@Query("SELECT file FROM BoardFileEntity file WHERE board_idx = :boardIdx AND idx = :idx")
	BoardFileEntity findBoardFile(@Param("boardIdx") int boardIdx, @Param("idx") int idx);
}
