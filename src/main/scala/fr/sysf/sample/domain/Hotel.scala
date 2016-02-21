package fr.sysf.sample.domain

import java.lang.Long
import java.util.{Calendar, Date}
import javax.persistence._

import org.hibernate.validator.constraints.NotEmpty

import scala.beans.BeanProperty

@Entity
class Hotel {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @BeanProperty
  @Column(insertable = true, updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  var creatingDate: Date = _

  @BeanProperty
  @Version
  @Temporal(TemporalType.TIMESTAMP)
  var updatingDate: Date = _

  @BeanProperty
  @NotEmpty
  var name: String = _

  @BeanProperty
  @NotEmpty
  var address: String = _

  @BeanProperty
  @NotEmpty
  var zip: String = _

  @PrePersist
  def onCreate {
    creatingDate = Calendar.getInstance().getTime;
  }

  /*
    @PreUpdate
    def onUpdate {
      updatingDate = Calendar.getInstance().getTime;
    }
  */
}