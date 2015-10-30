# authzforce-ce-parent
Authzforce Community Edition - parent project

# Notes
1. To prepare a release (example using a HTTP proxy):
<pre><code>
    $ mvn -Dhttps.proxyHost=proxyhostname -Dhttps.proxyPort=3128 jgitflow:release-start
</code></pre>
2. Make sure the new release branch created builds OK in Travis CI.
3. To perform the release (example using a HTTP proxy):
<pre><code>
    $ mvn -Dhttps.proxyHost=proxyhostname -Dhttps.proxyPort=3128 jgitflow:release-finish
</code></pre>
    If, after deployment, the command does not succeed because of some issue with the branches. Fix the issue, then re-run the same command but with 'noDeploy' option set to true to avoid re-deployment:
<pre><code>
    $ mvn -Dhttps.proxyHost=proxyhostname -Dhttps.proxyPort=3128 -DnoDeploy=true jgitflow:release-finish
</code></pre>
