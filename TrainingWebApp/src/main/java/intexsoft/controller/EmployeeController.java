package intexsoft.controller;

import intexsoft.mappers.OrderMapper;
import intexsoft.mappers.UserMapper;
import intexsoft.mappers.UserOrdersMapper;
import intexsoft.model.Order;
import intexsoft.model.User;
import intexsoft.model.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {


    @Autowired
    DriverManagerDataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers() throws Exception {
        String sql = "SELECT * FROM t_user";
        jdbcTemplate.setDataSource(getDataSource());
        List<User> users = jdbcTemplate.query(sql, new UserMapper());
        return users;
    }

    @RequestMapping(value = "/getUserOrders", method = RequestMethod.GET)
    public @ResponseBody
    List<UserOrder> getUserOrders(@RequestParam("userId")int id) throws Exception {
        String sql = "SELECT user_name, product_name,product_price, product_quantity FROM t_user " +
                                                                    "JOIN t_orders ON fk_user_id = user_id " +
                                                                    "WHERE user_id="+id+"";
        jdbcTemplate.setDataSource(getDataSource());
        List<UserOrder> userOrder = jdbcTemplate.query(sql, new UserOrdersMapper());
        return userOrder;
    }

    @RequestMapping(value = "/getAllOrders", method = RequestMethod.GET)
    public @ResponseBody
    List<Order> getAllOrders() throws Exception {
        String sql = "SELECT * FROM t_orders";
        jdbcTemplate.setDataSource(getDataSource());
        List<Order> orders = jdbcTemplate.query(sql, new OrderMapper());
        return orders;
    }

    @RequestMapping(value ="/addOrder", method = RequestMethod.POST)
    @ResponseBody
    public Order addOrder(@RequestBody Order ord) {
        System.out.println("Start createEmployee.");
        String sql = "INSERT INTO t_orders VALUES("+ord.getId()+", "+ord.getFk_user_id()+", '"+ord.getProduct_name()+"', "+ord.getProduct_price()+", "+ord.getProduct_quantity()+")";
        jdbcTemplate.update(sql);
        String str = "{\"result\":ok}";
        return ord;
    }
//
//    @RequestMapping(value ="/addOrder", method = RequestMethod.GET)
//    @ResponseBody
//    public String addOrderGet(@RequestParam ("order_id") int id,
//                              @RequestParam ("fk_user_id") int userId,
//                              @RequestParam ("product_name") int productName,
//                              @RequestParam ("product_price") int productPrice,
//                              @RequestParam ("product_quantity") int productQuantuty) {
//        String sql = "INSERT INTO t_orders VALUES("+id+", "+userId+", '"+productName+"', "+productPrice+", "+productQuantuty+")";
//        jdbcTemplate.update(sql);
//        String str = "Order added";
//        return str;
//    }

    @RequestMapping(value = "changePage", method = RequestMethod.GET)
    public String changePage(){
        return "index1";
    }

    @RequestMapping(value = "gotoHTML", method = RequestMethod.GET)
    public String gotoHTML(){
        return "index2";
    }



    public DriverManagerDataSource getDataSource() {
        return dataSource;
    }
}
