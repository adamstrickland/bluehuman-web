import _root_.java.math.MathContext
import _root_.net.liftweb.mapper._
​
class Org extends LongKeyedMapper[Org] with IdPK {
  def getSingleton = Org
  object name extends MappedString(this, 100)
}

object Org extends LongKeyedMetaMapper[Org] {
  
}