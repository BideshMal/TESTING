package TrainingData;

public class Module extends Course {
	protected String Mname;

    public Module(String courseName, String moduleName) {
        super(courseName);
        this.Mname = moduleName;
    }

    @Override
    public String getTrainerName() {
        return super.getTrainerName();
    }

    @Override
    public void setTrainerName(String trainerName) {
        super.setTrainerName(trainerName);
    }
}

