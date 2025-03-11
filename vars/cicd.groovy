def gitDownload(repo)
{
  git "https://github.com/Manoj-devp/${repo}.git"
}
def gitBuild()
{
  sh "mvn package"
}
