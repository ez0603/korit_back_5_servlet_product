package com.study.product.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {
	private int productId;
	private String productName;
	private int productPrice;
	private String productSize;
}
