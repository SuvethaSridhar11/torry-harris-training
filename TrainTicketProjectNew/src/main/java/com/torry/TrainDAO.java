package com.torry;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainDAO {
    public static Connection con = DBConnection.getConnection();

    public static Train findTrain(int trainNo) throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from trains where train_no =" + trainNo);
        rs.next();
        return new Train(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
    }
}
