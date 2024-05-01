import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
	private Connection con;
	
	public conexion(){
		establecerconexion();

}

	
	public void establecerconexion(){
		//Variables asociadas a la base de datos
		String host="localhost";
		String user="root";
		String pass="";
		String basededatos="bd_envios";
		try {
			//Conexión a la BD
			Class.forName("com.mysql.jdbc.Driver");
			String newConnectionURL="jdbc:mysql://"+host+"/"+basededatos+"?"+"user="+user+"&password="+pass;
			con=DriverManager.getConnection(newConnectionURL);
			System.out.println("Conexión exitosa con la BD ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error en la conexion");
		}
	}

}
		
		
		
		
		
		