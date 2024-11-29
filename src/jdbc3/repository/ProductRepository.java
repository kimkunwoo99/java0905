package jdbc3.repository;

import jbdc.JDBCconnector;
import jdbc3.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductRepository {

    public static ArrayList<Product> getList(String type, String searchWord){
        ArrayList<Product> arrList = new ArrayList<>();
        Connection con = JDBCconnector.getConnection();
        String sql = "select * from 제품 where " + type + " like ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql); // 문장객체 생성
            pstmt.setString(1, "%"+searchWord+"%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setProNum(rs.getString("제품번호"));
                product.setProName(rs.getString("제품명"));
                product.setProStock(rs.getInt("재고량"));
                product.setPrice(rs.getInt("단가"));
                product.setProduceName(rs.getString("제조업체"));
                arrList.add(product);
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return arrList;
    }
}
