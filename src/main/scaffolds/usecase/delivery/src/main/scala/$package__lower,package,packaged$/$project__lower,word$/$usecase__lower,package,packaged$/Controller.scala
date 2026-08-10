package $package;format="lower,package"$
package $project;format="lower,word"$
package $usecase;format="lower,package"$

final class Controller private (boundary: Boundary)

object Controller extends (Boundary => Controller):
  final override def apply(boundary: Boundary): Controller =
    Controller(boundary)
