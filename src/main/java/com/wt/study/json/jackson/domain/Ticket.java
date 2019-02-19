package com.wt.study.json.jackson.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wt.study.json.jackson.config.DateSerialize;
import com.wt.study.json.jackson.config.DateTimeSerialize;

import java.util.Date;

/**
 * @ProjectName: study
 * @Package: com.wt.study.json.jackson.domain
 * @Description: 车票实体
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-02-18 10:25
 * @Version: v1.0
 */
public class Ticket {
    private long id;

    @JsonIgnore
    private String passenger;

    @JsonProperty(value = "date")
    @JsonSerialize(using = DateTimeSerialize.class)
    private Date startDate;

    @JsonSerialize(using = DateSerialize.class)
    private Date createDateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }
}
