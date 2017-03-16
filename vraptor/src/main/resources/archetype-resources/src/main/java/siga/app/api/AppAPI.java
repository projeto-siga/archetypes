package br.jus.trf2.siga.app.api;

import io.swagger.annotations.Api;
import io.swagger.jaxrs.config.BeanConfig;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Api
@ApplicationPath("/api/v1")
public class AppAPI extends Application {

	public AppAPI() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setBasePath("/app/api/v1/");
        beanConfig.setResourcePackage("br.jus.trf2.siga.app.api");
        beanConfig.setScan(true);
	}

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet();


        resources.add(InfoAPI.class);

        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        
        return resources;
    }

}
