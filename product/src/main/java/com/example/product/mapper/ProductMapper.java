package com.example.product.mapper;

import com.example.product.domain.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    //    게시글 목록
    public List<ProductVO> getList();
}
