package communitygarden;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import communitygarden.config.RootConfig;
import communitygarden.config.WebConfig;

public class CommunityGardenWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
