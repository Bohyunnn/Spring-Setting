package bhboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bhboot.mapper.TestMapper;
import bhboot.model.TestModel;

@Service
public class TestService {
	
	@Autowired
	private TestMapper testMapper;
	
	public void insTestModel(int testId, String value) {
		TestModel testModel = new TestModel();
		testModel.setTestId(testId);
		testModel.setValue(value);
		testMapper.insTestModel(testModel);
	}
	
	public TestModel getTestModel(int testId) {
		return testMapper.getTestModel(testId);
	}

}
