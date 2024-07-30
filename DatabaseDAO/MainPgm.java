package DatabaseDAO;

public class MainPgm {
    public static void main(String[] args)
    {
    Patient patientObj=new Patient();
    patientObj.setPatientName("John Doe");
patientObj.setMedicalHistory("High Sugar");
patientDAO.createPatient(patientObj);
}
}
