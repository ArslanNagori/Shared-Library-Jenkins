def call(){
  sh "trivy fs --skip-version-check --severity HIGH,CRITICAL -o trivy-fs-report.txt . && cat trivy-fs-report.txt"
}
