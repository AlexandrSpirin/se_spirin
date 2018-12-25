package sef.module13.activity;

import org.h2.command.Prepared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

	@SuppressWarnings("unused")
	private Connection conn;

	public AccountDAOImpl(Connection conn) {
		this.conn = conn;
	}

	public List<Account> findAccount(String firstName, String lastName)
			throws AccountDAOException {
		try {

			PreparedStatement pStmt =
					conn.prepareStatement("select * from Account where UPPER(FIRST_NAME) LIKE ? AND UPPER(LAST_NAME) LIKE ?");
			pStmt.setString(1, "%" + firstName.toUpperCase() + "%");
			pStmt.setString(2, "%" + lastName.toUpperCase() + "%");
			ResultSet rs = pStmt.executeQuery();
			List<Account> accountList = new ArrayList();
			while(rs.next())
			{
				accountList.add(new AccountImpl(rs.getInt("ID"), rs.getString("FIRST_NAME"),
						rs.getString("LAST_NAME"), rs.getString("E_MAIL")));
			}
			conn.commit();
			rs.close();
			return accountList;
		}
		catch (Exception e){
			throw new AccountDAOException(AccountDAOException.ERROR_FIND_NAME, new Throwable(e));
		}
	}

	public Account findAccount(int id) throws AccountDAOException {
		try {

			PreparedStatement pStmt =
					conn.prepareStatement("select * from Account where ID = ?");
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			Account tempAccount = null;
			while(rs.next())
			{
				tempAccount = new AccountImpl(rs.getInt("ID"), rs.getString("FIRST_NAME"),
						rs.getString("LAST_NAME"), rs.getString("E_MAIL"));
			}
			conn.commit();
			rs.close();
			return tempAccount;
		}
		catch (Exception e){
			throw new AccountDAOException(AccountDAOException.ERROR_FIND_ID, new Throwable(e));
		}
	}


	public boolean insertAccount(String firstName, String lastName, String email)
			throws AccountDAOException {
		try {
			PreparedStatement pStmt = conn.prepareStatement
					("insert into Account (ID, FIRST_NAME, LAST_NAME, E_MAIL) VALUES (ACCOUNT_SEQ.NEXTVAL, ?,?,?)");
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
