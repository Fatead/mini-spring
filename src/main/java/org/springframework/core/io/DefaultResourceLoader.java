package org.springframework.core.io;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 资源加载器的实现类，可以加载三种资源，分别是
 * 1.classpath资源
 * 2.URL资源
 * 3.文件资源
 * @date 2020/11/25
 */
public class DefaultResourceLoader implements ResourceLoader {

	public static final String CLASSPATH_URL_PREFIX = "classpath:";

	@Override
	public Resource getResource(String location) {
		if (location.startsWith(CLASSPATH_URL_PREFIX)) {
			//classpath下的资源
			return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
		} else {
			try {
				//尝试当成url来处理
				URL url = new URL(location);
				return new UrlResource(url);
			} catch (MalformedURLException ex) {
				//当成文件系统下的资源处理
				return new FileSystemResource(location);
			}
		}
	}
}
