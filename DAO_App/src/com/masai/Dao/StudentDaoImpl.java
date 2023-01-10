package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.utility.Dbutil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String registerStudent(Student st) throws StudentException {
	
			// TODO Auto-generated method stub
			String result=null;
			try(Connection conn=Dbutil.provideConnection()){
				PreparedStatement ps=conn.prepareStatement("insert into student (name,address,email) values (?,?,?)");
				ps.setString(1, st.getName());
				ps.setString(2, st.getAddress());
				ps.setString(3, st.getEmail());
				int x=ps.executeUpdate();
				if(x>0) {
					result="Student Register Succesfully";
				}
			}catch(SQLException e) {
				e.printStackTrace();
				throw new StudentException(e.getMessage());
			}
				
			
			return result;
		}

	}

	

