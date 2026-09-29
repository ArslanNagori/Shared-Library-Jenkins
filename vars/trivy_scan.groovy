def call(){
  sh "trivy fs --skip-version-check --severity HIGH,CRITICAL . | tee trivy-fs-report.txt"
}
