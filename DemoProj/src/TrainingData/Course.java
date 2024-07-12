package TrainingData;

public class Course implements Training{
	protected static String name; // Changed to static to be consistent with your usage

    protected String trainingVendorName;
    protected String trainerName;
    protected int totalDurationInHrs;
    protected int totalNumberOfTrainees;

    public void setTrainingDetails(String trainingVendorName, String trainerName, int totalDurationInHrs, int totalNumberOfTrainees) {
        this.trainingVendorName = trainingVendorName;
        this.trainerName = trainerName;
        this.totalDurationInHrs = totalDurationInHrs;
        this.totalNumberOfTrainees = totalNumberOfTrainees;
    }

    public Course(String courseName) {
        this.name = courseName;
    }

    @Override
    public String getTrainigVendorName() {
        return trainingVendorName;
    }

    @Override
    public String getTrainerName() {
        return trainerName;
    }

    @Override
    public int getTotalDurtionInHrs() {
        return totalDurationInHrs;
    }

    @Override
    public int getTotalNumberOfTrainees() {
        return totalNumberOfTrainees;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

}
