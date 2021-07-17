package com.yahoo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class StringParserUtil {

    private static final Logger log = LoggerFactory.getLogger(StringParserUtil.class);

    public static String insertToString(String text, String ... values) {
        StringBuilder sb = new StringBuilder(text);

        Arrays.stream(values).forEach(a -> {
            int index = sb.indexOf("{}");
            System.out.println(index);
            if(index > 0) {
                sb.replace(index, index + 2, a);
            }
        });
        log.debug("insertToString response: {}", sb.toString());
        return sb.toString();
    }

}
