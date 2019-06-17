package cn.itcast.dateconverter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * String转为Date，便于存储进数据库
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mi:ss");
        Date parse = null;
        try {
            parse=sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return parse;

    }
}
