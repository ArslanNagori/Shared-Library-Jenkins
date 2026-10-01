def call(String sonarServer, String projectName, String projectKey, String scannerTool = 'Sonar'){
  def scannerHome = tool scannerTool
  withSonarQubeEnv(sonarServer){
    sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectName=${projectName} -Dsonar.projectKey=${projectKey} -Dsonar.sources=. -Dsonar.exclusions=dependency-check-report.*,trivy-fs-report.txt,**/node_modules/**,.scannerwork/**"
  }
}
