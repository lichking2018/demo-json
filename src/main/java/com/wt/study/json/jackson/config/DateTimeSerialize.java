package com.wt.study.json.jackson.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: study
 * @Package: com.wt.study.json.jackson.config
 * @Description: 序列化规则-时间日期
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-02-18 10:19
 * @Version: v1.0
 */
public class DateTimeSerialize extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateFormat = simpleDateFormat.format(date);
        jsonGenerator.writeString(dateFormat);
    }


}
