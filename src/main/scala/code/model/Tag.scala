import _root_.java.math.MathContext
import _root_.net.liftweb.mapper._
​
class Tag extends LongKeyedMapper[Tag] with IdPK {
  import TagType._
  
  def getSingleton = Tag
  object project extends MappedLongForeignKey(this, Project)
  object type extends MappedEnum[Tag, TagType.type](this, TagType)
}

object Tag extends LongKeyedMetaMapper[Tag] {
  object TagType extends Enumeration {
    type TagType = Value
    val Hard, Soft = Value
  }
}