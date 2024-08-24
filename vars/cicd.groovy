def download(repo)
{
  git "https://github.com/konkatimanojkumar/${repo}.git"
}
def build()
{
  sh 'mvn package'
}
def deploy(jobname,ipaddress,appname)
{
  sh "scp /var/lib/Jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}: /var/lib/tomcat9/webapps/${appname}.war"
}
