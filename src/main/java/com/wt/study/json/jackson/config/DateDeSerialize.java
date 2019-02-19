package com.wt.study.json.jackson.config;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: study
 * @Package: com.wt.study.json.jackson.config
 * @Description: 反序列化配置
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-02-18 11:19
 * @Version: v1.0
 */
public class DateDeSerialize extends JsonDeserializer<Date> {
    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException,
            JsonProcessingException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(jsonParser.getText());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
