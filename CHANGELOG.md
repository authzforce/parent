# Change log
All notable changes to this project are documented in this file following the [Keep a CHANGELOG](http://keepachangelog.com) conventions.


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

