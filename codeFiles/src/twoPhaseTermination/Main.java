package twoPhaseTermination;

public class Main {
	public static void main(String[] args) {
		System.out.println("main: BEGIN");
		try {
//�����߳�
			CountupThread t = new CountupThread();
			t.start();
//��΢���- -��ʱ��
			Thread.sleep(10000);
//�̵߳���ֹ����
			System.out.println("main: shutdownRequest");
			t.shutdownRequest();
			System.out.println("main: join");
//�ȴ��߳���ֹ
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("main: END");
		}

	}
}