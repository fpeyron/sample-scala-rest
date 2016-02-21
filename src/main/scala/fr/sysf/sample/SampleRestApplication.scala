package fr.sysf.sample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{ComponentScan, Configuration}

object SampleRestApplication extends App {
  SpringApplication.run(classOf[BootConfig]);
}

@Configuration
@EnableAutoConfiguration
@ComponentScan
class BootConfig 