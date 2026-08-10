package $package;format="lower,package"$
package $project;format="lower,word"$
package $usecase;format="lower,package"$

object DependencyGraph extends (Array[String] => Controller):
  def apply(args: Array[String]): Controller =
    Controller(
      boundary = Boundary(
        //gateway = new $db;format="Camel"$Gateway())
    )
