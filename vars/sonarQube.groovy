def call() {
  withSonarQubeEnv('Sonar-server-7.8') {
    sh "mvn sonar:sonar"
  }
}