
package bel.log4j.bug

import groovy.util.logging.Log4j2

@Log4j2
class SomeServiceClassGroovy {

    static public void doLogging() {
        log.error("SomeServiceClassGroovy.doLogging()");
        log.warn("SomeServiceClassGroovy.doLogging()");
        log.info("SomeServiceClassGroovy.doLogging()");
        log.debug("SomeServiceClassGroovy.doLogging()");
    }

}
