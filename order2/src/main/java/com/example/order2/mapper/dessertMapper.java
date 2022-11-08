package com.example.order2.mapper;

import com.example.order.domain.vo.ItemVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface dessertMapper {
//    추가
    public void insert(DessertVO dessertVO);
//    수정
    public void update(DessertVO dessertVO);
//    조회
    public DessertVO select(Long dessertNumber);
//    전체 조회
    public List<DessertVO> selectAll();
}
