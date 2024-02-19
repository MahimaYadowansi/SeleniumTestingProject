package testcases;

import java.sql.SQLException;

import utilities.DbManager;

public class TestDbConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DbManager.setMysqlDbConnection();
		System.out.print(DbManager.getMysqlQuery("select tuorial_author from selenium where tutorial_id =3"));
	}

}
