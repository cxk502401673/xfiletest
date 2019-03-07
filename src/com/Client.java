package com;

import java.net.MalformedURLException;

import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

import test.HelloService1;


public class Client {
	
	 public static void main(String args[]) throws MalformedURLException  {
		    Service service = new ObjectServiceFactory().create(TestServiceIfc.class);
	        XFireProxyFactory factory = new XFireProxyFactory(XFireFactory.newInstance().getXFire());
	        String url = "http://localhost:8080/xfiretest/services/TestServiceIfc";
	        TestServiceIfc helloService = (TestServiceIfc) factory.create(service,url);
	        System.out.println(helloService.helloWorld("张三"));
	 }
	 
//	 public static void main(String args[]) throws MalformedURLException  {
//		    //这里都是固定格式。
//		    Service service = new ObjectServiceFactory().create(HelloService1.class);
//	        XFireProxyFactory factory = new XFireProxyFactory(XFireFactory.newInstance().getXFire());
//	        //只需要改变url即可
//	        String url = "http://10.250.196.228:8088/XFireWebService/services/HelloService";
//	        HelloService1 helloService = (HelloService1) factory.create(service,url);
//	        System.out.println(helloService.getTestString("张三"));
//	 }


}
