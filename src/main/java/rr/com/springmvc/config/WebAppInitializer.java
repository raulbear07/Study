package rr.com.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        // 配置上传文件路径
        String filepath = "e:/mvc/uploads";
        // 5MB
        Long singleMax = (long) (5 * Math.pow(2, 20));
        // 10MB
        Long totalMax = (long) (10 * Math.pow(2, 20));
        // 设置上传文件配置
        registration.setMultipartConfig(new MultipartConfigElement(filepath, singleMax, totalMax, 0));
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"*.do"};
    }


}
