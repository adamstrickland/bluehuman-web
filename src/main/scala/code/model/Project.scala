import _root_.java.math.MathContext
import _root_.net.liftweb.mapper._
​
class Project extends LongKeyedMapper[Project] with IdPK {
  def getSingleton = Project
  object name extends MappedString(this, 100)
  object clientName extends MappedString(this, 100)
}

object Project extends LongKeyedMetaMapper[Project] {
  
}