package $package;format="lower,package"$
package $project;format="lower,package"$
package $usecase;format="lower,package"$

object DependencyGraph extends (Array[String] => Controller):
  def apply(args: Array[String]): Controller =
    Controller(
      boundary = Boundary(
        gateway = $db;format="Camel"$)
    )
