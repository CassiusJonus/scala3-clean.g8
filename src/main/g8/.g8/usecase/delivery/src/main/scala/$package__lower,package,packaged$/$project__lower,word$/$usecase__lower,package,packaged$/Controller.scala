package $package;format="lower,package"$package
package $project;format="lower,package"$package
package $usecase;format="lower,package"$package

final class Controller private (boundary: Boundary)

object Controller extends (Boundary => Controller):
  final override def apply(boundary: Boundary): Controller =
    Controller(boundary)
