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
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-02-18 11:10
 * @Version: v1.0
 */
public class DateSerialize extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        jsonGenerator.writeString(simpleDateFormat.format(new Date()));
    }
}
