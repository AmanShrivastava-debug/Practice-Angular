package DatabaseDAO;

import java.sql.*;
import java.sql.SQLException;

public class PatientDAO {
     private Connection connection;
     public PatientDAO()
     {
        try{
            connection =DatabaseConnection.getConnection();

        }
        catch(SQLException e){
            e.printStackTrace();
        }
     }
     public void createPatient(Patient patient)
     {
        String sql="Insert into patients(patientName,medicalHistory) values(?,?)";
        try
        {
            (PreparedStatement statement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS))
            statement.setString(1,patient.getPatientName());
            statement.setString(2,patient.getMedicalHistory());
            statement.executeUpdate();
            ResultSet generatedKeys=statement.getGeneratedKeys();
            if(generatedKeys.next())
            {
                patient.setPatientID(generatedKeys.getInt(1))
            }
            catch(SQLException e)
            
        }
     }
    }