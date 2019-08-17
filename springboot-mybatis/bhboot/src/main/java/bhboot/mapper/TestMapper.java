package bhboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import bhboot.model.TestModel;

@Mapper
public interface TestMapper {

	int insTestModel(TestModel testModel);
	TestModel getTestModel(@Param("testId") int testId);
	
}
