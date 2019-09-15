mave:

create maven project
	main/java  (we can change default path in pom.xml, but it is not recommended
	test/java
	WEB-Inf/lib

in Intellij:
there is maven tab on right
there u can run a command or resolve a dependency
ctrl+b on artifactname in pom to go to its pom
right click on pom--> maven --> show effective pom

maven lifeCycle(commands  +  clean ):
validate - validate the project is correct and all necessary information is available
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package - take the compiled code and package it in its distributable format, such as a JAR.
verify - run any checks on results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.
clean


Steps: If you have only the standard maven plugins from the default superpom, adding a dependency will:
download the specified version to your local repository(/user/.m2)
use it to compile
use it to run tests
during packaging, maven copy dependencies(their binary) to the package

Version Range Specification:
Range	Meaning
1.0	x >= 1.0 * The default Maven meaning for 1.0 is everything (,) but with 1.0 recommended. Obviously this doesn't work for enforcing versions here, so it has been redefined as a minimum version.
(,1.0]	x <= 1.0
(,1.0)	x < 1.0
[1.0]	x == 1.0

mvn tomcat:run
When developping a war project, you usually build your war and deploy it to an installed Tomcat instance. This is time and resources consuming and take time to install locally the instance. 
The run mojo give you the opportunity to save that by simply running your war inside an embeded Tomcat instance in your Maven build.

dependency:
when we reimport on the pom.xml, all related jars are downloaded and save in ../user/.m2, and also they would be in projectStructure/Artifact
if we want to have them physically in WEB-INF/lib, we can put the in new path from projectStructure/Artifact
