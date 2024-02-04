package com.cosine.generals.udf;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hive.ql.exec.UDF;

public class test extends UDF {
    // 去除str开头以及结尾的空格
    public String evaluate(String str) {
        if (str == null) {
            return null;
        }
        return StringUtils.strip(str);
    }

    // 去除str开头以及结尾的stripChars中该指定字符集中的任意字符
    public String evaluate(String str, String stripChars) {
        if (str == null) {
            return null;
        }
        return StringUtils.strip(str, stripChars);
    }
}