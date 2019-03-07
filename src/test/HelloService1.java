package test;

//调用别人的服务端，接口名称不要求一致，我这里调用别人的写的是HelloService1 ，实际上别人的接口是HelloService
//方法名要一致，参数名称不要求一致，返回类型要求一致。
public interface HelloService1 {
	
	public String getTestString(String aa);

}
