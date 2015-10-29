# authzforce-ce-parent
Authzforce Community Edition - parent project

# Notes
1. To prepare a release (example using a HTTP proxy):
```
$ mvn -Dhttps.proxyHost=MY_USERNAME:PASSWORD@proxyhostname -Dhttps.proxyPort=3128 jgitflow:release-start
```
2. Make sure the project builds OK in Travis CI.
3. To perform the release (example using a HTTP proxy):
```
$ mvn -Dhttps.proxyHost=MY_USERNAME:PASSWORD@proxyhostname -Dhttps.proxyPort=3128 jgitflow:release-start
```
