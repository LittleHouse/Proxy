/**
 * 
 */
package net.cglib;

import net.sf.cglib.proxy.Enhancer;

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
		Programmer progammer = new Programmer();

		Hacker hacker = new Hacker();
		// cglib �м�ǿ��������������̬����
		Enhancer enhancer = new Enhancer();
		// ����Ҫ������̬�������
		enhancer.setSuperclass(progammer.getClass());
		// ���ûص��������൱���Ƕ��ڴ����������з����ĵ��ã��������CallBack����Callback����Ҫʵ��intercept()������������
		enhancer.setCallback(hacker);
		Programmer proxy = (Programmer) enhancer.create();
		proxy.code();
		proxy.lover();
	}

}
