package Day6.src.main.java.Dao;

import Day6.src.main.java.Exception.UserException;

public interface StDao {
	public void AddUser() ;
	public void GetAllPhone(int Id) throws UserException;
}
