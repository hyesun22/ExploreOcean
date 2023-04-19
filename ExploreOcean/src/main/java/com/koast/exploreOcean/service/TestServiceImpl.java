package com.koast.exploreOcean.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.koast.exploreOcean.mapper.TestMapper;
import com.koast.exploreOcean.model.Test;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

	private final TestMapper testMapper;
	
	@Override
	public List<Test> selectAll() {
		return testMapper.selectAll();
	}
}
