package LikeLionPrac01.prac01.post.service;

import LikeLionPrac01.prac01.post.dto.BoardDto;
import LikeLionPrac01.prac01.post.repository.BoardRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}
