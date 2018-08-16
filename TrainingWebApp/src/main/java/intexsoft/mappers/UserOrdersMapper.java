package intexsoft.mappers;

import intexsoft.model.UserOrder;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserOrdersMapper implements RowMapper<UserOrder> {

    public UserOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserOrder userOrder = new UserOrder();
        userOrder.setUserName(rs.getString("user_name"));
        userOrder.setProductName(rs.getString("product_name"));
        userOrder.setProductPrice(rs.getInt("product_price"));
        userOrder.setProductQuantity(rs.getInt("product_quantity"));
        return userOrder;
    }
}
