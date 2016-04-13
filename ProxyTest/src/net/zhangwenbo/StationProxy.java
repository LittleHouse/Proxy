/**
 * ��̬����ʵ����
 */
package net.zhangwenbo;

/**
 * @author Iver3oN Zhang
 * @date 2016��4��13��
 * @email grepzwb@qq.com
 * StationProxy.java
 * Impossible is nothing
 */
public class StationProxy implements TicketService {
	
	private Station station;
	

	public StationProxy(Station station) {
		super();
		this.station = station;
	}

	/* (non-Javadoc)
	 * @see net.zhangwenbo.TicketService#sellTicket()
	 */
	@Override
	public void sellTicket() {
		// 1.������ҵ��ǰ����ʾ��Ϣ  
        this.showAlertInfo("��������������ʹ�ó�Ʊ���۵���й�Ʊ��ÿ��Ʊ������ȡ5Ԫ�����ѣ���������");  
        // 2.������ʵҵ���߼�  
        station.sellTicket();  
        // 3.����  
        this.takeHandlingFee();  
        this.showAlertInfo("����������ӭ���Ĺ��٣��ټ�����������\n");  
	}

	/* (non-Javadoc)
	 * @see net.zhangwenbo.TicketService#inquire()
	 */
	@Override
	public void inquire() {
		  // 1������ҵ��ǰ����ʾ��Ϣ  
        this.showAlertInfo("����������ӭ���ٱ����۵㣬��ѯ���񲻻���ȡ�κη��ã�����ѯ��Ϣ�����ο���������Ϣ�Գ�վ��ʵ����Ϊ׼����������");  
        // 2.������ʵ�߼�  
        station.inquire();  
        // 3������  
        this.showAlertInfo("����������ӭ���Ĺ��٣��ټ�����������\n");  
	}

	/* (non-Javadoc)
	 * @see net.zhangwenbo.TicketService#withdraw()
	 */
	@Override
	public void withdraw() {
		 // 1������ҵ��ǰ����  
        this.showAlertInfo("����������ӭ���ٱ����۵㣬��Ʊ���˿۳�Ʊ���20%�⣬�������������2Ԫ�����ѣ���������");  
        // 2.��������ҵ���߼�  
        station.withdraw();  
        // 3.����  
        this.takeHandlingFee();  

	}
	
	/* 
     * չʾ������Ϣ 
     */  
    private void showAlertInfo(String info) {  
        System.out.println(info);  
    }  
    /* 
     * ��ȡ������ 
     */  
    private void takeHandlingFee() {  
        System.out.println("��ȡ�����ѣ���ӡ��Ʊ����������\n");  
    }  

}
