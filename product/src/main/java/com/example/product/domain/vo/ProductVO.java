package com.example.product.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductVO {
    private Long productNumber;
    private String productName;
    private String productPrice;
    private String productStock;
};