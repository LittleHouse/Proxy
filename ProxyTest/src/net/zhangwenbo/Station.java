/**
 * ��վʵ����Ʊ����ӿ�
 */
package net.zhangwenbo;

/**
 * @author Iver3oN Zhang
 * @date 2016��4��13��
 * @email grepzwb@qq.com
 * Station.java
 * Impossible is nothing
 */
public class Station implements TicketService {

	/* (non-Javadoc)
	 * @see net.zhangwenbo.TicketService#sellTicket()
	 */
	@Override
	public void sellTicket() {
		// TODO Auto-generated method stub
		System.out.println("��վ��Ʊ");
	}

	/* (non-Javadoc)
	 * @see net.zhangwenbo.TicketService#inquire()
	 */
	@Override
	public void inquire() {
		// TODO Auto-generated method stub
		System.out.println("��վ��ѯ");
	}

	/* (non-Javadoc)
	 * @see net.zhangwenbo.TicketService#withdraw()
	 */
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("��վ��Ʊ");
	}

}
