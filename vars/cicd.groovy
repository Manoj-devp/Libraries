def gitDownload(repo)
{
  git "https://github.com/Manoj-devp/${repo}.git"
}
def build()
{
  sh 'mvn package'
}
