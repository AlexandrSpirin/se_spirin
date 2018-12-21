package sef.module13.activity;

import org.h2.command.Prepared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

	private Connection conn;

	public AccountDAOImpl(Connection conn) {
		this.conn = conn;
	}

	public List<Account> findAccount(String firstName, String lastName)
			throws AccountDAOException {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from Account where FIRST_NAME = "
					+ firstName +" AND LAST_NAME = " + lastName);
			List<Account> tempAccountList = new ArrayList();
			while(rs.next())
			{
				tempAccountList.add(new AccountImpl(rs.getInt("ID"), rs.getString("FIRST_NAME"),
						rs.getString("LAST_NAME"), rs.getString("E_MAIL")));
			}
			rs.close();
			st.close();
			return tempAccountList;
		}
		catch (Exception e){
			throw new AccountDAOException(AccountDAOException.ERROR_FIND_NAME, new Throwable(e));
		}
	}

	public Account findAccount(int id) throws AccountDAOException {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from Account where ID = "
					+ id);
			Account tempAccount = null;
			while(rs.next())
			{
				tempAccount = new AccountImpl(rs.getInt("ID"), rs.getString("FIRST_NAME"),
						rs.getString("LAST_NAME"), rs.getString("E_MAIL"));
			}
			rs.close();
			st.close();
			return tempAccount;
		}
		catch (Exception e){
			throw new AccountDAOException(AccountDAOException.ERROR_FIND_ID, new Throwable(e));
		}
	}


	public boolean insertAccount(String firstName, String lastName, String email)
			throws AccountDAOException {
		try {
			PreparedStatement pStmt
					= conn.prepareStatement("insert into Account (FIRST_NAME, LAST_NAME, E_MAIL) VALUES (?,?,?)");
			pStmt.setString(1,firstName);
			pStmt.setString(2,lastName);
			pStmt.setString(3,email);
			pStmt.executeUpdate();
			conn.commit();
			return true;
		}
		catch (Exception e){
			throw new AccountDAOException(AccountDAOException.ERROR_INSERT_ACCOUNT, new Throwable(e));
		}
	}

}
