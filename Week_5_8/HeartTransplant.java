import java.util.ArrayList;

public class HeartTransplant {
	// patient array, each Patient is read from the data file
	private Patient[] patients;
	// SurvivabilityByAge array, each rate is read from data file
	private SurvivabilityByAge survivabilityByAge;
	// SurvivabilityByCause array, each rate is read from data file
	private SurvivabilityByCause survivabilityByCause;
	/*
	 * Default constructor
	 * Initializes patients to null.
	 * Initializes survivabilityByAge to null.
	 * Initializes survivabilityByCause to null.
	 */
	public HeartTransplant() {
		patients = null;
		survivabilityByAge = null;
		survivabilityByCause = null;
	}
	/*
	 * Returns patients
	 */
	public Patient[] getPatients() {
		return patients;
	}
	/*
	 * Returns survivabilityByAge
	 */
	public SurvivabilityByAge getSurvivabilityByAge() {
		return survivabilityByAge;
	}
	/*
	 * Returns survivabilityByCause
	 */
	public SurvivabilityByCause getSurvivabilityByCause() {
		return survivabilityByCause;
	}
	/*
	 * 1) Initialize the instance variable patients array with numberOfLines length.
	 *
	 * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
	 * File Format:
	 * ID, ethnicity, Gender, Age, Cause, Urgency, State of health
	 *
	 * Each line refers to one Patient, all values are integers.
	 *
	 */
	public void readPatients (int numberOfLines) {
		patients = new Patient[numberOfLines];
		for (int i=0; i<numberOfLines; i++) {
			patients[i] = new Patient(
					StdIn.readInt(), 
					StdIn.readInt(), 
					StdIn.readInt(), 
					StdIn.readInt(), 
					StdIn.readInt(), 
					StdIn.readInt(),
					StdIn.readInt());
		}
	}
	/*
	 * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
	 *
	 * 2) Reads from the command line file to populate the object.
	 * Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
	 *
	 * File Format: Age YearsPostTransplant Rate
	 * Each line refers to one survivability rate by age.
	 *
	 */
	public void readSurvivabilityByAge (int numberOfLines) {
		this.survivabilityByAge = new SurvivabilityByAge();
		for (int i=0; i<numberOfLines; i++) 
			survivabilityByAge.addData(StdIn.readInt(), StdIn.readInt(), StdIn.readDouble());
	}
	/*
	 * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
	 *
	 * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an
	 * integer and StdIn.readDouble() to read a double.
	 *
	 * File Format: Cause YearsPostTransplant Rate
	 * Each line refers to one survivability rate by cause.
	 *
	 */
	public void readSurvivabilityByCause (int numberOfLines) {
		this.survivabilityByCause = new SurvivabilityByCause();
		for (int i=0; i<numberOfLines; i++)
			survivabilityByCause.addData(StdIn.readInt(), StdIn.readInt(), StdIn.readDouble());
	}
	/*
	 * Returns a Patient array containing the patients,
	 * from the patients array, that have age above the parameter age.
	 *
	 * The return array has to be completely full with no empty
	 * spots, that is the array size should be equal to the number
	 * of Patients with age above the parameter age.
	 *
	 * Return null if there is no Patient with age above the
	 * parameter age.
	 */
	public Patient[] getPatientsWithAgeAbove(int age) {
		ArrayList<Patient> list = new ArrayList<Patient>();
		for (Patient patient : patients) 
			if (patient.getAge() >= age)
				list.add(patient);
		if (list.size() == 0)
			return null;
		else
			return list.toArray(new Patient[0]);
	}
	/*
	 * Returns a Patient array containing the patients, from the patients array,
	 * that have the heart condition cause equal to the parameter cause.
	 *
	 * The return array has to be completely full with no empty
	 * spots, that is the array size should be equal to the number
	 * of Patients with the heart condition cause equal to the parameter cause.
	 *
	 * Return null if there is no Patient with the heart condition cause
	 * equal to the parameter cause.
	 */
	public Patient[] getPatientsByHeartConditionCause(int cause) {
		ArrayList<Patient> list = new ArrayList<Patient>();
		for (Patient patient : patients) 
			if (patient.getCause() == cause)
				list.add(patient);
		if (list.size() == 0)
			return null;
		else
			return list.toArray(new Patient[0]);
	}
	/*
	 * Returns a Patient array containing patients, from the patients array,
	 * that have the state of health equal to the parameter state.
	 *
	 * The return array has to be completely full with no empty
	 * spots, that is the array size should be equal to the number
	 * of Patients with the state of health equal to the parameter state.
	 *
	 * Return null if there is no Patient with the state of health
	 * equal to the parameter state.
	 */
	public Patient[] getPatientsByUrgency(int urgency) {
		ArrayList<Patient> list = new ArrayList<Patient>();
		for (Patient patient : patients) 
			if (patient.getUrgency() == urgency)
				list.add(patient);
		if (list.size() == 0)
			return null;
		else
			return list.toArray(new Patient[0]);
	}
	/*
	 * Assume there is a heart available for transplantation surgery.
	 * Also assume that the heart is of the same bloodtype as the
	 * Patients on the patients array.
	 * This method finds the Patient to be the recepient of this
	 * heart.
	 *
	 * The method returns a Patient from the patients array with
	 * he highest potential for survivability after the transplant.
	 *
	 * Assume the patient returned by this method will receive a heart,
	 * therefore the Patient will no longer need a heart.
	 *
	 * There is no correct solution, you may come up with any
	 * function to find the patient with the highest potential
	 * for survivability after the transplant.
	 */
	public Patient getPatientForTransplant () {
		//get patients with hightest urgency
		Patient[] patients = getPatientsByUrgency(Patient.URGENCY_EXTREME);
		//if none, get with moderate urgency
		if (patients == null)
			patients = getPatientsByUrgency(Patient.URGENCY_MODERATE);
		//if no patients, return null
		if (patients == null)
			return null;
		
		//look for patient with highest survivability
		Patient maxPatient = null;
		double maxSurvivability = 0;
		
		for (Patient patient: patients) {
			//skip if done with transplant
			if (!patient.getNeedHeart())
				continue;
			double survivability = getSurvivabilityRate(patient);
			//if no patient chosen or survivability is higher, pick the patient
			if (maxPatient == null || survivability > maxSurvivability) {
				maxPatient = patient;
				maxSurvivability = survivability;
			}
		}
		//set to need heart to false
		maxPatient.setNeedHeart(false);
		return maxPatient;
	}
	
	//helper method to get the survivability rate of a patient
	private double getSurvivabilityRate(Patient patient) {
		double byCause = this.survivabilityByCause.getRate(patient.getCause(), 5);
		
		//if data for age is not found, keep incrementing age until found
		double byAge = 0;
		int i = 0;
		do {
			byAge = this.survivabilityByAge.getRate(patient.getAge()+i, 5);
			i++;
		} while (byAge == -1);
		
		//return average of byCause and by Age
		return (byCause + byAge)/2; 
	}
}