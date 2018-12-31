# Change log
All notable changes to this project are documented in this file following the [Keep a CHANGELOG](http://keepachangelog.com) conventions.


## 7.5.0
### Changed
- Upgraded managed dependency versions:
	- Spring: 4.3.18
	- guava: 24.1.1-jre
	- jaxb2-basics: 1.11.1

- Upgraded managed build plugin versions:
	- jaxb2-rich-contact-plugin version: 2.0.1

- Replaced maven-jaxb2-plugin with maven-jaxb22-plugin v0.14.0 for Java 1.8 compatibility
- Changed company name to Thales in copyright


## 7.4.0
### Changed
- Dependency versions:
	- CXF: 3.2.5 (fix CVE-2018-1305, CVE-2018-1304)


## 7.3.0
### Changed
- Dependency versions: 
  - logback-classic: 1.2.3
  - logback-ext-spring: 0.1.5
  - Spring: 4.3.14.RELEASE
  - CXF: 3.2.4
  - Saxon-HE: 9.8.0-12
- Plugin versions:
  - OWASP dependency-check-maven: 3.2.1 


## 7.2.0
### Changed
- Managed dependency versions: 
  - logback-classic: 1.1.9 -> 1.2.2 (to fix CVE affecting versions < 1.2.0)
  - slf4j: 1.7.22 --> 1.7.25 (to match logback-classic version upgrade above)
- Managed plugin versions:
  - OWASP dependency-check plugin 3.0.1 -> 3.0.2 (fix blocking bug #978 on their github) 


## 7.1.0
### Changed
- Managed dependency versions:
	- org.everit.json.schema: 1.6.0 -> 1.6.1
	- guava: 21.0 -> 22.0
	- json: 20170516 -> 20171018


## 7.0.0
### Changed
- Managed dependency versions:
	CXF: 3.1.10 -> 3.2.1
	Spring: 4.3.6 -> 4.3.12
    JAX-RS (javax.ws.rs-api): 2.0.1 -> 2.1
- OWASP dependency-check maven plugin: 1.4.4.1 -> 3.0.1-
- Java class naming convention: only first letter in acronym should be uppercase, e.g. XACMLVersion -> XacmlVersion

### Added
- Xacml3JaxbHelper utility class for processing XACML 3.0 schema-defined XML documents with JAXB and schema validation
- XacmlStatusCode enum class for standard XACMl 3.0 status codes
	

## 6.0.1
### Fixed
- Path to license header file for license plugin


## 6.0.0
### Removed
- Removed timeToLiveSec, timeToIdleSec and memoryStoreEvictionPolicy attributes from the XML schema definition of PDP Decision cache (AbstractDecisionCache type), because we learnt that mainstream decision cache implementations do not support all these, e.g. Guava cache as of v20.0 does not support other memoryStoreEvictionPolicy than LRU. It is now up to DecisionCache implementations to add these attributes in their configuration schema if necessary.


## 5.1.0
### Changed
- License: GPL v3.0 replaced by Apache License v2.0
- Project URL: https://tuleap.ow2.org/projects/authzforce -> https://authzforce.ow2.org
- GIT repository URL base: https://tuleap.ow2.org/plugins/git/authzforce -> https://gitlab.ow2.org/authzforce


## 5.0.0
### Changed
- Renamed enum XACMLCategory to XACMLAttributeCategory and simplified its constants
- Renamed/simplified XACMLAttributeId enum constants
- Managed dependency versions:
	SLF4J: 1.7.6 -> 1.7.22
	CXF: 3.1.9 -> 3.1.10
	Spring: 4.3.5 -> 4.3.6
	Logback-classic: 1.1.1 -> 1.1.9
	Guava: 20.0 -> 21.0


## 4.1.1
### Fixed
- Upgraded OWASP dependency-check maven plugin: 1.4.4 -> 1.4.4.1 => fix issue with multi-module projects (#617 on GitHub)


## 4.1.0
### Changed
- Upgraded managed dependency versions: Spring 4.3.4 -> 4.3.5, CXF 3.1.8 -> 3.1.9, Saxon-HE 9.7.0-11 -> 9.7.0-14
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

