package intexsoft.mappers;

import intexsoft.model.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<Order> {

    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        Order order = new Order();
        order.setId(rs.getInt("order_id"));
        order.setFk_user_id(rs.getInt("fk_user_id"));
        order.setProduct_name(rs.getString("product_name"));
        order.setProduct_price(rs.getInt("product_price"));
        order.setProduct_quantity(rs.getInt("product_quantity"));
        return order;
    }
}
