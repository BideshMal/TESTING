package TrainingData;

public class Main {
	public static void main(String[] args) {
		
        Course course = new Course("Java Programming");
        course.setTrainingDetails("ABC Training", "Bidesh", 30, 25);

        
        Module module = new Module("Java Programming", "Module 1");
        module.setTrainerName("Abhi");

        
        Unit unit = new Unit("Java Programming", "Module 1", "Unit A");

        
        System.out.println("Course Name: " + course.name);
        System.out.println("Module Name: " + module.Mname);
        System.out.println("Unit Name: " + unit.Uname);
        System.out.println("Trainer Name for Module: " + module.getTrainerName());
	}
}
