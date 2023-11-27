package EISAPI.Eland.API.Controller;

import EISAPI.Eland.API.Repository.Orders;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.sql.SQLException;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/ediAPI")
@RequiredArgsConstructor
public class APIController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/getOrders")
    public List<Orders> getOrders(@ModelAttribute Orders orders) throws SQLException {

        String sql = "[dbo].[up_SP_IF_CNT_POInfoList_R] ?,? ";
//        List<Orders> test =  jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Orders.class) , orders.getVendorCode(), orders.getPONO());
        List<Orders> test =  jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Orders.class) , orders.getVendorCode(), orders.getPONO());

        return test;
    }

}
