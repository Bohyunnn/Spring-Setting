package bhboot.model;

public class TestModel {
	
	private Integer testId;
	private String value;
	
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "TestModel [testId=" + testId + ", value=" + value + "]";
	}
	
}
