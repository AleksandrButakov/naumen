package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/testing.properties"
})

public interface RemoteDriverConfig extends Config {

    @Key("isRemote.driver")
    Boolean webIsRemoteDriver();


    @Key("remote.driver")
    String getRemoteDriver();

}