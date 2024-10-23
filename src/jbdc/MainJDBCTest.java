package jbdc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainJDBCTest {
    public static void main(String[] args) {
        Connection con = JDBCconnector.getConnection();
        String sql = "select 주문고객,제품명,수량 from 주문 o, 제품 p\n " +
                                "            where o.주문제품 = p.제품번호";
        PreparedStatement pstmt = null;
        try {
          pstmt = con.prepareStatement(sql);
          ResultSet result = pstmt.executeQuery();
          while (result.next()){
              String customorId = result.getString("주문고객");
              String productName = result.getString("제품명");
              int count = result.getInt("수량");
              System.out.printf("- 주문고객명: %s \t- 주문제품명: %s\t - 수량: %d\n", customorId, productName, count);
          }

        } catch (SQLException e) {
            System.out.println("문장객체 생성에 문제가 발생했습니다.");
        }

        try {
            pstmt.close();
            con.close();
        }  catch(SQLException e){
            System.out.println("연결종료에 문제가 발생했습니다.");
        }
    }
}
