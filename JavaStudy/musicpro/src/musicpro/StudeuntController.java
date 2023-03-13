package musicpro;

public class StudeuntController {

	//이 파트는 제어를 할 수 있는 구간입니다.
	//여기는 두 변수를 만들어주세요.
	private Student model;
	private StudentView view;
	
	
	public StudeuntController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	public Student getModel() {
		return model;
	}
	public void setModel(Student model) {
		this.model = model;
	}
	public StudentView getView() {
		return view;
	}
	public void setView(StudentView view) {
		this.view = view;
	}
	
	
	
	

	
	
	
}
