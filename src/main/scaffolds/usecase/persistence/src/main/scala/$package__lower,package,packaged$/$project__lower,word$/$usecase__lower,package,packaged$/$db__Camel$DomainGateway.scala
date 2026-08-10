package $package;format="lower,package"$
package $project;format="lower,word"$
package $usecase;format="lower,package"$

object $db;format="Camel"$DomainGateway extends (() => $db;format="Camel"$DomainGateway):
  final override def apply(): $db;format="Camel"$DomainGateway =
    new $db;format="Camel"$DomainGateway()
