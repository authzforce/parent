# Change log
All notable changes to this project are documented in this file following the [Keep a CHANGELOG](http://keepachangelog.com) conventions.


## 4.1.0
### Changed
- Upgraded managed dependency versions: Spring 4.3.4 -> 4.3.5, CXF 3.1.8 -> 3.1.9, Saxon-HE 9.7.0-11 -> 9.1.0-14
- Findbugs plugin configuration: added finsecbugs-plugin 


## 4.0.0
### Added
- Maven pluginManagement: maven-jar-plugin 3.0.2
- Maven dependencyManagement: xml-resolver 1.2, Saxon-HE 9.7.0-11, guava 20.0

### Changed
- Java version: maven.compiler.source/target property: 1.7 -> 1.8
- Copyright end year in license headers: 2015 -> 2016
- Maven pluginManagement: license-maven-plugin 2.7 -> 3.0,
    maven-pmd-pluding 3.5 -> 3.7, findbugs-maven-plugin 3.0.2 -> 3.0.4,
    maven-source-plugin 2.1.2 -> 3.0.1, maven-javadoc-plugin 2.7 -> 2.10.4,
    nexus-staging-maven-plugin 1.6.3 -> 1.6.7, maven-gpg-plugin 1.5 -> 1.6
- Maven dependencyManagement: jaxb2-basics 0.9.5 -> 0.11.1, spring 3.2.2.RELEASE -> 4.3.4.RELEASE, spring: 3.2.2.RELEASE -> 4.3.4.RELEASE, javax.servlet-api 3.0.1
    -> 3.1.0
- Child module 'xacml-model': maven-jaxb2-plugin xjc args '-Xequals -XhashCode' -> '-XsimpleEquals -XsimpleHashCode'

### Removed
- POM inheritance from sonatype oss-parent (deprecated, more info: http://central.sonatype.org/pages/apache-maven.html#deprecated-oss-parent)
- spring-xml removed from dependencyManagement


## 3.4.0
### Added
- XACMLNodeName enum constants for other XACML elements: Policy, PolicySet, Rule, etc.
- log4j-over-slf4j, cxf-rt-rs-service-description and javax.servlet-api under Maven dependency management
- maven-pmd-plugin, findbugs-maven-plugin and  markdown-page-generator-plugin under Maven plugin management


## 3.3.7
### Fixed
- Versions of child modules in dependencyManagement to match parent version so that jgitflow updates the versions automatically without failing


## 3.3.6
### Fixed
- Useless dependency on xacml-model module in pdp-ext-model (removed)


## 3.3.5
### Fixed
- Issue with different versions of javax.ws.rs-api, cxf-rt-frontend-jaxrs, cxf-rt-rs-client in various authzforce projects, fixed by adding them under dependency management


## 3.3.4
### Fixed
- Issue with different versions of spring-context in various authzforce projects, fixed by adding spring-context under dependency management


## 3.3.3
### Added
- Initial public release (on Github)

