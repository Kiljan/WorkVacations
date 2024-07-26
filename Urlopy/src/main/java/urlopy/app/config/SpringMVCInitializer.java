package urlopy.app.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		/*adding logic for middle-tier services, datasources, root/global things*/
		return new Class<?>[] { RootConfig.class , DataConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		/*adding logic for web related controlers, view resolvers, heandler mappings and others web related beans*/
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}