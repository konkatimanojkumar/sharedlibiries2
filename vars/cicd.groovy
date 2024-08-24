def download(repo)
{
  git "https://github.com/konkatimanojkumar/${repo}.git"
}
def build()
{
  sh 'mvn package'
}
