package LikeLionPrac01.prac01.post.domain;
import LikeLionPrac01.prac01.post.dto.BoardDto;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity{


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(columnDefinition = "TEXT", nullable = false)
        private String name;

        @Column(length = 100, nullable = false)
        private Integer age;

        @Column(columnDefinition = "TEXT", nullable = false)
        private String major;

        @Column(columnDefinition = "TEXT", nullable = false)
        private String contents;

       @Builder
        public Board(Long id, String name, Integer age, String major, String contents){
               this.id=id;
               this.name = name;
               this.age = age;
               this.major = major;
               this.contents = contents;
       }


    public void update(BoardDto boardDto) {
        this.name = boardDto.getName();
        this.contents = boardDto.getContents();
    }
}
