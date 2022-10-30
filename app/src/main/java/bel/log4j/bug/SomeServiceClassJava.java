package bel.log4j.bug;

import lombok.extern.log4j.Log4j2;

@Log4j2
class SomeServiceClassJava {

    static public void doLogging() {
        log.fatal("SomeServiceClassJava.doLogging()");
    }

}