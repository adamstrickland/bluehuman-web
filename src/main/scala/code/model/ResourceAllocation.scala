import _root_.java.math.MathContext
import _root_.net.liftweb.mapper._
​
class ResourceAllocation extends LongKeyedMapper[ResourceAllocation] with IdPK{
  def getSingleton = ResourceAllocation
  object resource extends MappedLongForeignKey(this, Resource)
  object allocation extends MappedLongForeignKey(this, Allocation)
}

object ResourceAllocation extends LongKeyedMetaMapper[ResourceAllocation] {
  def join(resource:Resource, allocation:Allocation) = this.create.resource(resource).allocation(allocation).save
}