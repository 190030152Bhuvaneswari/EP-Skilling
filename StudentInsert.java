package Insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.StudentBean;
import Connections.DBUtil;

public class StudentInsert {
	public 	int StudentInsertion(StudentBean student ) throws ClassNotFoundException,SQLException{
	     Connection con =DBUtil.DBConnection();
	     PreparedStatement ps = con.prepareStatement("insert into student_details values (?,?,?)");
	     ps.setInt(1,student.getRegno() );
		 ps.setString(2, student.getName());
		 ps.setString(3, student.getEmail());
			int i=ps.executeUpdate();
			return i;
}
public int studentDelete(StudentBean student) throws ClassNotFoundException , SQLException {
	Connection con =DBUtil.DBConnection();
	PreparedStatement ps = con.prepareStatement("delete from student_details"+" WHERE regno=?");
	ps.setInt(1,student.getRegno());
	int b=ps.executeUpdate();
	con.close();
	return b;
}

public int studentUpdate(StudentBean student) throws ClassNotFoundException , SQLException {
	Connection con =DBUtil.DBConnection();
	PreparedStatement ps = con.prepareStatement("update student_details"+" SET name = ?"+" where regno=?");
	ps.setInt(1,student.getRegno());
	ps.setString(2,student.getName());
	int c=ps.executeUpdate();
	con.close();
	return c;
}

public void studentDisplay(StudentBean student) throws ClassNotFoundException , SQLException {
	Connection con =DBUtil.DBConnection();
	PreparedStatement ps = con.prepareStatement("select * from student_details");
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getInt(1) + " "+rs.getString(2)+" "+rs.getString(3));
	}
	rs.close();
}

}
