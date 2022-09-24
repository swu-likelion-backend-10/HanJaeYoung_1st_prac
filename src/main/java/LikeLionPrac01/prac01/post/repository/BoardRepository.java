package LikeLionPrac01.prac01.post.repository;

import LikeLionPrac01.prac01.post.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
