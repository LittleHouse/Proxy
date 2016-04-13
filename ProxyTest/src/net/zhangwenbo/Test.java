/**
 * ��������
 */
package net.zhangwenbo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Iver3oN Zhang
 * @date 2016��4��13��
 * @email grepzwb@qq.com Test.java Impossible is nothing
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Station station = new Station(); StationProxy proxy = new
		 * StationProxy(station); proxy.sellTicket();
		 */

		Station station = new Station();
		// 1.��ȡ��Ӧ��ClassLoader
		ClassLoader classLoader = station.getClass().getClassLoader();

		// 2.��ȡstation ��ʵ�ֵ����нӿ�
		Class[] interfaces = station.getClass().getInterfaces();
		// 3.����һ�����Դ��������ķ������������������������еĴ�������ϵķ�������
		InvocationHandler handler = new InvocationHandlerImpl(station);
		/*
		 * 4.���������ṩ����Ϣ������������� ����������У� a.JDK��ͨ�����ݴ���Ĳ�����Ϣ��̬�����ڴ��д�����.class �ļ���ͬ���ֽ���
		 * b.Ȼ�������Ӧ���ֽ���ת���ɶ�Ӧ��class�� c.Ȼ�����newInstance()����ʵ��
		 */
		Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);
		TicketService stationproxy = (TicketService) o;
		stationproxy.sellTicket();
	}

}
