package $package;format="lower,package"$
package $project;format="lower,word"$
package $usecase;format="lower,package"$

trait Boundary

object Boundary extends (DomainGateway => Boundary):
  final override def apply(gateway: DomainGateway): Boundary =
    new Usecase(gateway)

  final private class Usecase(gateway: DomainGateway) extends Boundary
