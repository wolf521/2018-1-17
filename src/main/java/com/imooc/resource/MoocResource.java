package com.imooc.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**
 + * UrlResource:url对应的资源，根据一个URL地址进行构建
 + * ClassPathResource:获取类路径下的资源文件
 + * FileSystemResource:获取文件系统里面的文件资源
 + * ServletContextResource:获取ServletContext下的资源文件
 + * InputStreamResource:获取输入流里面的资源文件
 + * ByteArrayResource:针对于字节数组封装的资源文件
 + *
 + */
public class MoocResource implements ApplicationContextAware  {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void resource() throws IOException {
		//Resource resource = applicationContext.getResource("classpath:config.xml");
		//Resource resource = applicationContext.getResource("file:E:\\Spring\\src\\main\\resources\\config.xml");
		//Resource resource = applicationContext.getResource("config.xml");
		Resource resource = applicationContext.getResource("url:https://www.toutiao.com/a6511885475978936840/");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
