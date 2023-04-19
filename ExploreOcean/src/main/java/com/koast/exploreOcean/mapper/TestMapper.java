package com.koast.exploreOcean.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.koast.exploreOcean.model.Test;

@Mapper
public interface TestMapper {
	List<Test> selectAll();
}
