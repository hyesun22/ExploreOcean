package com.koast.exploreOcean.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //Getter & Setter
@NoArgsConstructor //기본생성자 자동생성 
@AllArgsConstructor //모든 필드에 대해 초깃값을 인수로 받는 생성자 생성
public class Test {
	
	private Integer id;
	private String test;

}
