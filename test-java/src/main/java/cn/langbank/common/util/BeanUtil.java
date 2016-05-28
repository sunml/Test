package cn.langbank.common.util;

import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * Bean操作相关工具类
 * @author liujing(lewkinglove@gmail.com)
 *
 */
public class BeanUtil {

    /**
     * 将数据赋值给指定对象的相应属性
     * @param field 字段
     * @param objInstance 指定对象
     * @param value 数据
     * @throws IllegalAccessException
     */
    public static void setFieldValue(Field field, Object objInstance, String value) throws Exception {
        String fieldType = field.getType().getName();// 取字段的数据类型
        field.setAccessible(true);
        if (fieldType.equals("java.lang.String")) {
            field.set(objInstance, value);
        } else if (fieldType.equals("java.lang.Integer") || fieldType.equals("int")) {
            field.set(objInstance, Integer.valueOf(value));
        } else if (fieldType.equals("java.lang.Long") || fieldType.equals("long")) {
            field.set(objInstance, Long.valueOf(value));
        } else if (fieldType.equals("java.lang.Float") || fieldType.equals("float")) {
            field.set(objInstance, Float.valueOf(value));
        } else if (fieldType.equals("java.lang.Double") || fieldType.equals("double")) {
            field.set(objInstance, Double.valueOf(value));
        } else if (fieldType.equals("java.math.BigDecimal")) {
            field.set(objInstance, new BigDecimal(value));
        } else if (fieldType.equals("java.util.Date")) {
            field.set(objInstance, ConvertUtil.parseDate(value));
        } else if (fieldType.equals("java.sql.Date")) {
            field.set(objInstance, new java.sql.Date(ConvertUtil.parseDate(value).getTime()));
        } else if (fieldType.equals("java.lang.Boolean") || fieldType.equals("boolean")) {
            field.set(objInstance, Boolean.valueOf(value));
        } else if (fieldType.equals("java.lang.Byte") || fieldType.equals("byte")) {
            field.set(objInstance, Byte.valueOf(value));
        } else if (fieldType.equals("java.lang.Short") || fieldType.equals("short")) {
            field.set(objInstance, Short.valueOf(value));
        }
    }
}