//���ɴ������  ����
//package net.zhangwenbo;
//import net.zhangwenbo.TicketService;  
//import java.lang.reflect.InvocationHandler;  
//import java.lang.reflect.Method;  
//import java.lang.reflect.Proxy;  
//import java.lang.reflect.UndeclaredThrowableException;  
///** 
// ���ɵĶ�̬���������֯ģʽ�Ǽ̳�Proxy�࣬Ȼ��ʵ����Ҫʵ�ִ�������ϵ����нӿڣ�����ʵ�ֵĹ����У�����ͨ�������еķ�����������InvocationHandler������ 
//*/  
// public final class StationProxy extends Proxy  
//  implements TicketService  
//{  
//  private static Method m1;  
//  private static Method m3;  
//  private static Method m4; 
//  private static Method m5; 
//  private static Method m0;  
//  private static Method m2;  
//  
//  public StationProxy(InvocationHandler paramInvocationHandler)  
//    throws   
//  {  
//    super(paramInvocationHandler);  
//  }  
//  
//  public final boolean equals(Object paramObject)  
//    throws   
//  {  
//    try  
//    { // ��������ʵ�ֽ���InvocationHandler����  
//      return ((Boolean)this.h.invoke(this, m1, new Object[] { paramObject })).booleanValue();  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  
//  public final void sellTicket()  
//    throws   
//  {  
//    try  
//    {  
//  
//       // ��������ʵ�ֽ���InvocationHandler����  
//  
//      this.h.invoke(this, m3, null);  
//      return;  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  
//  public final void inquire() throws   
//  {  
//    try  
//    {  
//  
//       // ��������ʵ�ֽ���InvocationHandler����  
//  
//      this.h.invoke(this, m4, null);  
//      return;  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  public final void withdraw()  
//		    throws   
//		  {  
//		    try  
//		    {  
//		  
//		       // ��������ʵ�ֽ���InvocationHandler����  
//		  
//		      this.h.invoke(this, m5, null);  
//		      return;  
//		    }  
//		    catch (Error|RuntimeException localError)  
//		    {  
//		      throw localError;  
//		    }  
//		    catch (Throwable localThrowable)  
//		    {  
//		      throw new UndeclaredThrowableException(localThrowable);  
//		    }  
//		  }  
//  
//  public final int hashCode()  
//    throws   
//  {  
//    try  
//    {  
//  
//       // ��������ʵ�ֽ���InvocationHandler����  
//  
//       return ((Integer)this.h.invoke(this, m0, null)).intValue();  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  
//  public final String toString()  
//    throws   
//  {  
//    try  
//    {  
//  
//       // ��������ʵ�ֽ���InvocationHandler����  
//      return (String)this.h.invoke(this, m2, null);  
//    }  
//    catch (Error|RuntimeException localError)  
//    {  
//      throw localError;  
//    }  
//    catch (Throwable localThrowable)  
//    {  
//      throw new UndeclaredThrowableException(localThrowable);  
//    }  
//  }  
//  
//  static  
//  {  
//    try  
//    {  //Ϊÿһ����Ҫ�������󣬵�������Ӧ�ķ���ʱ���ֱ𽫷���������Ϊ�������ݸ�InvocationHandler����  
//      m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[] { Class.forName("java.lang.Object") });  
//    //���ؽӿ��ж���ķ���sellTicket inquire withdraw
//      m3 = Class.forName("net.zhangwenbo.TicketService").getMethod("sellTicket", new Class[0]);  
//      m4 = Class.forName("net.zhangwenbo.TicketService").getMethod("inquire", new Class[0]); 
//      m5 = Class.forName("net.zhangwenbo.TicketService").getMethod("withdraw", new Class[0]);  
//      m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);  
//      m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);  
//      return;  
//    }  
//    catch (NoSuchMethodException localNoSuchMethodException)  
//    {  
//      throw new NoSuchMethodError(localNoSuchMethodException.getMessage());  
//    }  
//    catch (ClassNotFoundException localClassNotFoundException)  
//    {  
//      throw new NoClassDefFoundError(localClassNotFoundException.getMessage());  
//    }  
//  }  
//}  