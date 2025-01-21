package com.dao.person;

import java.sql.Connection;

import java.sql.PreparedStatement;

import com.model.person.Worker;

public class WorkerDAO {

	private Connection conn;

	public WorkerDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addWorker(Worker w) {
		boolean f = false;
		try {
			String sql = "insert into worker(first_name,last_name,age,cardNumber,phoneNumber,position,selary,lengthOfService)"
					+ "values(?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, w.getFirstName());
			ps.setString(2, w.getLastName());
			ps.setInt(3, w.getAge());
			ps.setInt(4, w.getCardNumber());
			ps.setInt(5, w.getPhoneNumber());
			ps.setString(6, w.getPosition());
			ps.setDouble(7, w.getSalary());
			ps.setInt(8, w.getLengthOfService());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public boolean deleteWorker(Worker w) {
		boolean f = false;
		try {
			String sql = "delete worker where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, w.getId());

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
