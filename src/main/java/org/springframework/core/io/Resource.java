package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源的抽象和访问接口
 * 对应三个实现类：
 * 1.FileSystemResource:文件系统资源的实现类
 * 2.ClassPathResource:classPath下资源的实现类
 * 3.UrlResource:对java.net.URL进行资源定位的实现类
 *
 * @author derekyi
 * @date 2020/11/25
 */
public interface Resource {

	InputStream getInputStream() throws IOException;

}
