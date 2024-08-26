package service.loader;

import service.api.ServiceAPI;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class ServiceLoaderClass
{
    public static void main( String[] args )
    {
        ServiceLoader<ServiceAPI>  services = ServiceLoader.load(ServiceAPI.class);
        ServiceAPI service = services.findFirst().orElseThrow();

    }
}
