package cn.langbank.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * 
 * 数据转换相关工具类
 * @author liujing(lewkinglove@gmail.com)
 *
 */
public class ConvertUtil {
	private static HashMap<String, SimpleDateFormat> allDateformater = new HashMap<String, SimpleDateFormat>();

	/**
	 * 设置默认的日期格式化风格
	 * 
	 * @param dateStyle
	 *            日期格式化的样式风格
	 */
	public static void setDefaultDateFormatStyle(String dateStyle) {
		SimpleDateFormat formater = new SimpleDateFormat(dateStyle);
		formater.setLenient(false);
		ConvertUtil.allDateformater.put("DEFAULT_STYLE", formater);
	}

	/**
	 * 使用默认风格 格式化当前时间
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String formatDate() throws Exception {
		return ConvertUtil.formatDate(new Date());
	}

	/**
	 * 使用默认风格 格式化指定日期对象
	 * 
	 * @param date
	 *            要格式化显示的日期对象
	 * @return
	 * @throws Exception
	 */
	public static String formatDate(Date date) throws Exception {
		SimpleDateFormat formater = ConvertUtil.allDateformater.get("DEFAULT_STYLE");
		if (formater == null)
			throw new Exception("未找到默认的日期格式化对象");

		synchronized (formater) {
			return formater.format(date);
		}
	}

	/**
	 * 使用指定风格 格式化当前时间
	 * 
	 * @param dateStyle
	 *            要显示的日期风格, 类似: yyyy-MM-dd
	 * @return
	 * @throws Exception
	 */
	public static String formatDate(String dateStyle) {
		return ConvertUtil.formatDate(dateStyle, new Date());
	}

	/**
	 * 使用指定风格 格式化指定的日期对象
	 * 
	 * @param dateStyle
	 *            要显示的日期风格, 类似: yyyy-MM-dd
	 * @param date
	 *            要格式化的日期
	 * @return
	 */
	public static String formatDate(String dateStyle, Date date) {
		SimpleDateFormat formater = ConvertUtil.allDateformater.get(dateStyle);
		if (formater == null) {
			formater = new SimpleDateFormat(dateStyle);
			ConvertUtil.allDateformater.put(dateStyle, formater);
		}

		// TODO 此种方法对性能不友好, 有时间了改成ThreadLocal形式
		synchronized (formater) {
			return formater.format(date);
		}
	}

	/**
	 * 使用默认风格 转换指定的时间字符串为Date对象
	 * 
	 * @param dateStr
	 *            要转换的时间字符串
	 * @return
	 * @throws Exception
	 */
	public static Date parseDate(String dateStr) throws Exception {
		SimpleDateFormat formater = ConvertUtil.allDateformater.get("DEFAULT_STYLE");
		if (formater == null)
			throw new Exception("未找到默认的日期格式化对象");

		synchronized (formater) {
			return formater.parse(dateStr);
		}
	}

	/**
	 * 使用指定的风格 转换指定的时间字符串为Date对象
	 * 
	 * @param dateStr
	 *            要转换的时间字符串
	 * @param dateStyle
	 *            要使用的转换样式格式, 例如: yyyy-MM-dd
	 * @return
	 * @throws Exception
	 */
	public static Date parseDate(String dateStr, String dateStyle) throws Exception {
		SimpleDateFormat formater = ConvertUtil.allDateformater.get(dateStyle);
		if (formater == null) {
			formater = new SimpleDateFormat(dateStyle);
			formater.setLenient(false);
			ConvertUtil.allDateformater.put(dateStyle, formater);
		}

		// TODO 此种方法对性能不友好, 有时间了改成ThreadLocal形式
		synchronized (formater) {
			return formater.parse(dateStr);
		}
	}

	// TODO 删除测试的Main方法
	public static void main(String[] args) throws Exception {
		System.out.println(ConvertUtil.formatDate("yyyyMMdd", new Date()));
		System.out.println(ConvertUtil.formatDate("yyyy年MM月dd日 HH时mm分ss秒 E ", new Date()));
		System.out.println(ConvertUtil.formatDate(new Date()));
	}

}
