package com.wt.study.json.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wt.study.json.jackson.domain.Ticket;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: study
 * @Package: com.wt.study.json.jackson
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-02-18 10:31
 * @Version: v1.0
 */
public class TestJackson {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void test1() throws JsonProcessingException {
        Ticket ticket = new Ticket();
        ticket.setId(1);
        ticket.setCreateDateTime(new Date());
        ticket.setStartDate(new Date());
        ticket.setPassenger("lichking");


        String s = objectMapper.writeValueAsString(ticket);
        System.out.println(s);
    }

    @Test
    public void test2() throws JsonProcessingException {
        List<String> ids = new ArrayList<>();
        ids.add("001");
        ids.add("002");
        System.out.println(objectMapper.writeValueAsString(ids));

    }

}
