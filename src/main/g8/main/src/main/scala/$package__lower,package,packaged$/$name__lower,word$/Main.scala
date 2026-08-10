package $package;format="lower,package"$
package $name;format="lower,package"$

object Main extends App:
  /**
    * A sequence that contains the dependencies for the application as
    * DependencyGraph objectsobjects
    */
    Seq[DependencyGraph](
      // dependencies go here
    ).foreach(_.apply(args))

    private [this] type DependencyGraph =
      (Array[String] => Any)
