package bel.log4j.bug

import groovy.util.logging.Log4j2
import org.apache.log4j.BasicConfigurator
import org.apache.log4j.xml.DOMConfigurator

@Log4j2
class Starter {
    static {
        //System.setProperty("log4j.configurationFile", "log4j2-root-folder.xml")
    }
    static void main(String[] args) {
        //BasicConfigurator.configure()

        (1..10000).each {
          log.info "log number $it"
          App.main()
          Thread.sleep(1000)
      }
    }
}
