import _root_.java.math.MathContext
import _root_.net.liftweb.mapper._
​
class Allocation extends LongKeyedMapper[Allocation] with IdPK {
  def getSingleton = Allocation
  object project extends MappedLongForeignKey(this, Project)
  object allocation extends MappedDouble(this)
}

object Allocation extends LongKeyedMetaMapper[Allocation] {
  
}