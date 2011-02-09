import _root_.java.math.MathContext
import _root_.net.liftweb.mapper._
​
class Resource extends LongKeyedMapper[Resource] with IdPK{
  def getSingleton = Resource
  object lastName extends MappedString(this, 100)
  object firstName extends MappedString(this, 100)
  object level extends MappedString(this, 25)
  object allocations extends HasManyThrough(this, Allocation, ResourceAllocation, ResourceAllocation.allocation, ResourceAllocation.resource)
  
  def status = {
    
  }
  // object dateOf extends DateTimeField(this)
  // object description extends StringField(this, 100)
  // object amount extends DecimalField(this, MathContext.DECIMAL64, 2)
  // object account extends LongField(this)
}

object Resource extends LongKeyedMetaMapper[Resource] {
  
}