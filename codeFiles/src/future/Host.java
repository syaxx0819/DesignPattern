package future;

public class Host {

	
	public Data request(final int count ,final char c) {
		System.out.println("   request("+count+",  "+c+")  Start");
		
		
		//创建一个FutureData的实例
		final FutureData  future=new FutureData();
		//启动一个新线程,用于创建RealData的实例
		
		new Thread() {
			public void run() {
				RealData realdata =new RealData(count,c);
				future.setRealData(realdata);
				
			}
		}.start();
		
		System.out.println("   request("+count+",  "+c+")  End");
		
		return future;
	}
}
