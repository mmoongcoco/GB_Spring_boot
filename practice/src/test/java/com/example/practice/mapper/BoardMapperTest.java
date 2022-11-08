package com.example.practice.mapper;


import com.example.practice.domain.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BoardMapperTest {
    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void getListTest(){
        boardMapper.getList().stream().map(BoardVO::toString).forEach(log::info);
    }

    @Test
    public void insertTest(){
        /* 쿼리문이 재대로되는지 확인해보려고 값을 임의로 넣어줌 ->객체화, setter로 값 넣고, insert로 메소드 사용*/
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardTitle("테스트 제목2");
        boardVO.setBoardWriter("testB");
        boardVO.setBoardContent("테스트 내용2");
        boardMapper.insert(boardVO);/*메소드 사용*/
        log.info("추가된 게시글 번호: " + boardVO.getBoardNumber());/* getter로 insert된 boardNumber를 바로 확인 => selectKey 때문!!  */
    }

    @Test
    public void updateTest(){
        BoardVO boardVO  = boardMapper.select(1L);
        Assertions.assertNotNull(boardVO); /* 오류를 내서 오류 설명을 볼 수 있도록 함. */
        boardVO.setBoardTitle("수정된 게시글 제목");
        log.info("UPDATE COUNT: " + boardMapper.update(boardVO));
    }

    @Test
    public void deleteTest(){
        Long boardNumber = 2L;
        BoardVO boardVO = boardMapper.select(boardNumber);
        Assertions.assertNotNull(boardVO);
        boardMapper.delete(boardNumber);
    }
}
