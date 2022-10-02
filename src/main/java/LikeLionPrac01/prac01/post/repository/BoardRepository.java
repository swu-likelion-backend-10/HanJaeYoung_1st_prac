package LikeLionPrac01.prac01.post.repository;

import LikeLionPrac01.prac01.post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByNameContaining(String keyword);

}