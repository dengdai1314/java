//����ʽ���̲߳���ȫ
//�Ƿ� Lazy ��ʼ������
//�Ƿ���̰߳�ȫ����
//ʵ���Ѷȣ���
//���������ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м��� synchronized�������ϸ��������������㵥��ģʽ��
//���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
//public class SingleTon {
//	private static SingleTon instance;
//	private SingleTon() {}
//	
//	public static SingleTon getInstance() {
//		if(instance!=null) {
//			instance = new SingleTon();
//		}
//		return instance;
//	}
//}

//����ʽ���̰߳�ȫ
//�Ƿ� Lazy ��ʼ������
//�Ƿ���̰߳�ȫ����
//ʵ���Ѷȣ���
//���������ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
//�ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
//ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
//getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
//public class SingleTon{
//	private static SingleTon instance;
//	private SingleTon() {}
//	
//	public static synchronized SingleTon getInstance() {
//		if(instance!=null) {
//			instance = new SingleTon();
//		}
//		return instance;
//	}
//}

//����ʽ
//�Ƿ� Lazy ��ʼ������
//�Ƿ���̰߳�ȫ����
//ʵ���Ѷȣ���
//���������ַ�ʽ�Ƚϳ��ã������ײ�����������
//�ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
//ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
//������ classloader ���Ʊ����˶��̵߳�ͬ�����⣬������instance ����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ��� getInstance ������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ�� instance ��Ȼû�дﵽ lazy loading ��Ч����
//public class SingleTon {  
//    private static SingleTon instance = new SingleTon();  
//    private SingleTon (){}  
//    public static SingleTon getInstance() {  
//    	return instance;  
//    }  
//}

//˫����/˫��У������DCL���� double-checked locking��
//JDK �汾��JDK1.5 ��
//�Ƿ� Lazy ��ʼ������
//�Ƿ���̰߳�ȫ����
//ʵ���Ѷȣ��ϸ���
//���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
//getInstance() �����ܶ�Ӧ�ó���ܹؼ���
//public class SingleTon{
//	private volatile static SingleTon singleton;
//	private SingleTon() {}
//	public static SingleTon getSingleTon() {
//		if(singleton == null) {
//			synchronized(SingleTon.class) {
//				if(singleton == null) {
//					singleton = new SingleTon();
//				}
//				
//			}	
//		}
//		return singleton;
//	}
//}

//�Ǽ�ʽ/��̬�ڲ���
//�Ƿ� Lazy ��ʼ������
//�Ƿ���̰߳�ȫ����
//ʵ���Ѷȣ�һ��
//���������ַ�ʽ�ܴﵽ˫������ʽһ���Ĺ�Ч����ʵ�ָ��򵥡��Ծ�̬��ʹ���ӳٳ�ʼ����Ӧʹ�����ַ�ʽ������˫������ʽ�����ַ�ʽֻ�����ھ�̬��������˫������ʽ����ʵ������Ҫ�ӳٳ�ʼ��ʱʹ�á�
//���ַ�ʽͬ�������� classloader ��������֤��ʼ�� instance ʱֻ��һ���̣߳������� 3 �ַ�ʽ��ͬ���ǣ��� 3 �ַ�ʽֻҪ Singleton �౻װ���ˣ���ô instance �ͻᱻʵ������û�дﵽ lazy loading Ч�����������ַ�ʽ�� Singleton �౻װ���ˣ�instance ��һ������ʼ������Ϊ SingletonHolder ��û�б�����ʹ�ã�ֻ��ͨ����ʽ���� getInstance ����ʱ���Ż���ʽװ�� SingletonHolder �࣬�Ӷ�ʵ���� instance������һ�£����ʵ���� instance ��������Դ�������������ӳټ��أ�����һ���棬�ֲ�ϣ���� Singleton �����ʱ��ʵ��������Ϊ����ȷ�� Singleton �໹�����������ĵط�������ʹ�ôӶ������أ���ô���ʱ��ʵ���� instance ��Ȼ�ǲ����ʵġ����ʱ�����ַ�ʽ��ȵ� 3 �ַ�ʽ���Եúܺ���
//public class SingleTon {
//	private static class SingletonHolder{
//		private static final SingleTon INSTANCE =  new SingleTon();
//	}
//	private SingleTon() {}
//	public static final SingleTon getInstance() {
//		return SingletonHolder.INSTANCE;
//	}
//}

//ö��
public enum SingleTon{
	INSTANCE;
	public void whateverMethod() {
		
	}
}