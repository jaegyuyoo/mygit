package Exam1108.HumanProject_pdf_O;

public class Worker extends Human {

	private int workerID;

	public Worker() {
		super();
	}
	
	
	public Worker(int workerID) {
		super();
		this.workerID = workerID;
	}


	public Worker(String name, int age, int workerID) {
		super(name, age);
		this.workerID = workerID;
	}


	public int getWorkerID() {
		return workerID;
	}

	public void setWorkerID(int workerID) {
		this.workerID = workerID;
	}

	@Override
	public String toString() {
		return "Worker [workerID=" + workerID + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
