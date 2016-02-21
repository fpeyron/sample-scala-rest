package fr.sysf.sample

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.mock.web.MockServletContext
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

/**
 * Created by florent on 21/02/2016.
 */
@RunWith(classOf[SpringJUnit4ClassRunner])
@SpringApplicationConfiguration(classes = Array(classOf[MockServletContext]))
@WebAppConfiguration
class ApiRestTest {

  @Test
  def getHello {

  }
}
